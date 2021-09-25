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
    public int maxDepth(TreeNode root) {
        if(root==null)
            return 0;
        return maxDepth(root,1);
    }
    
    
    private int maxDepth(final TreeNode root,final int depth){
        
        if(root==null)
            return 0;
        else if(root.left==null && root.right==null)
            return depth;
        else{
            
            
            return Math.max(maxDepth(root.left,depth+1),maxDepth(root.right,depth+1));
            
            
        }
        
    }
}