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
        if(root==null)
            return false;
        
        if(root!=null && root.left==null && root.right==null)
            return root.val==targetSum;
        
        return hasPathSumUtil(root,targetSum);
        
    }
    
    
    
    private boolean hasPathSumUtil(TreeNode root, int targetSum){
        if(root==null)
            return false;
        if(isChildNode(root) && root.val!= targetSum)
            return false;
        if(isChildNode(root) && root.val==targetSum)
            return true;
        
        else 
            return hasPathSumUtil(root.left,targetSum-root.val) || hasPathSumUtil(root.right,targetSum-root.val);
        
    }
    
    private boolean isChildNode(TreeNode root){
        if(root==null)
            return false;
        return (root!=null && root.left==null && root.right==null);
        
    }
}