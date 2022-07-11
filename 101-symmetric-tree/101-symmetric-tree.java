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
    public boolean isSymmetric(TreeNode root) {
        
        return root==null || isSymmetricUtil(root.left,root.right);
        
    }
    
    private boolean isSymmetricUtil(TreeNode left,TreeNode right){
        if(left==null && right==null) return true;
        else if(left!=null && right!=null){
            
            return left.val == right.val && isSymmetricUtil(left.right,right.left) && isSymmetricUtil(left.left,right.right);
        }
        
        return false;
    }
    
}