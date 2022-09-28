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
    public int diameterOfBinaryTree(TreeNode root) {
        
        return helper(root)[0];
        
        
    }
    
    //best,height
    private int[] helper(TreeNode root){
        
        if(root==null) return new int[]{0,0};
        
        int[] left=helper(root.left);
        int[] right=helper(root.right);
        
        int height=Math.max(left[1],right[1])+1;
        int best=Math.max(left[1]+right[1],Math.max(left[0],right[0]));
        
        return new int[]{best,height};
        
        
        
    }
    
}