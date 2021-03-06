/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    
    private TreeNode clone(TreeNode node,int offset){
        if(node==null)
            return null;
        
        TreeNode clonedNode=new TreeNode(node.val+offset);
        clonedNode.left=clone(node.left,offset);
        clonedNode.right=clone(node.right,offset);
        
        return clonedNode;
        
        
        
    }
    
    public List<TreeNode> generateTrees(int n) {
        ArrayList<TreeNode>[] dp=new ArrayList[n+1];
        if(n==0)
            return dp[0];
        dp[0]=new ArrayList();
        dp[0].add(null);
        for(int len=1;len<=n;len++){
            dp[len]=new ArrayList();
            
            for(int root=1;root<=len;root++){
                
                int left=root-1;
                int right=len-root;
                
                for(TreeNode leftTree:dp[left]){
                    
                    for(TreeNode rightTree:dp[right]){
                        
                            TreeNode node=new TreeNode(root);
                    node.left=leftTree;
                    node.right=clone(rightTree,root);
                    dp[len].add(node);
                        
                    }
                    
                    
                }
                
            }
            
        }
        
        return dp[n];
        
        
        
    }
}