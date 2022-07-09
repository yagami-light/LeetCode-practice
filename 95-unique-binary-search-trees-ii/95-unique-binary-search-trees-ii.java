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
    public List<TreeNode> generateTrees(int n) {
        
        return generateTreesUtil(1,n);
    }
    
    
    private List<TreeNode> generateTreesUtil(int start,int end){
        List<TreeNode> res=new ArrayList();
        if(start==end)
            return Collections.singletonList((new TreeNode(start)));
        if(start>end)
            return Collections.singletonList(null);
        for(int i=start;i<=end;i++){
            
            
            List<TreeNode> leftNodes=generateTreesUtil(start,i-1);
            List<TreeNode> rightNodes=generateTreesUtil(i+1,end);

            for(TreeNode lnode:leftNodes){
                
                for(TreeNode rnode:rightNodes){
                    
                                TreeNode node=new TreeNode(i);
                    node.left=lnode;
                    node.right=rnode;
                    res.add(node);
                    
                    
                }
                
            }
            
        }
        
        return res;
        
        
        
        
    }
    
}