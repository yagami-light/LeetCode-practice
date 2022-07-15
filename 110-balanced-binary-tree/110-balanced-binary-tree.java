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
    public boolean isBalanced(TreeNode root) {
       if(root==null) 
        return true;
        
        else
        {
           return  Math.abs(isBalanced(root.left,0)-isBalanced(root.right,0)) <= 1 && isBalanced(root.left) && isBalanced(root.right);
        }
        
    }
    
    private int  isBalanced(TreeNode root,int height){
        if(root==null) return height;
        
        int left=isBalanced(root.left,height+1);
        int right=isBalanced(root.right,height+1);
        
        return Math.max(left,right);
    }
    
}