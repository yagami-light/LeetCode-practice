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
        
        
        return maxDepthUtil(root);
        
    }
    
    private int maxDepthUtil(TreeNode root){
        if(root==null)
            return 0;
        
        int left=1+maxDepthUtil(root.left);
        int right=1+maxDepthUtil(root.right);
        
        
        return Math.max(left,right);
        
        
    }
    
}