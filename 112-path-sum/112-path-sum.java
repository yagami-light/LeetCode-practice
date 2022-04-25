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
    public boolean hasPathSum(TreeNode root, int targetSum) {
        
        Deque<TreeNode> stack=new LinkedList();
        
        int currSum=0;
        TreeNode currNode=root;
        TreeNode prev=null;
        while(!stack.isEmpty() || currNode!=null){
            
            while(currNode!=null){
                
                stack.push(currNode);
                currSum+=currNode.val;

                currNode=currNode.left;
            }
            
            currNode=stack.peek();
            if(currNode.left==null && currNode.right==null && targetSum==currSum)
                return true;
            
            
            if(currNode.right!=null && prev!=currNode.right)
                currNode=currNode.right;
            else{
                
                prev=currNode;
                currSum-=currNode.val;
                stack.pop();
                currNode=null;
                
                
                
            }
            
            
            
            
        }
        return false;
        
        
    }
}