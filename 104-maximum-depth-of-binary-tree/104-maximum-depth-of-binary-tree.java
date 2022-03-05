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
        
        return maxDepth(root,0);
    }
    
    private int maxDepth(TreeNode root, int height){
        if(root==null)
            return height;
        
        int left=maxDepth(root.left,height);
        int right=maxDepth(root.right,height);
        
        return 1+Math.max(left,right);
        
        
        
        
    }
    
    
}