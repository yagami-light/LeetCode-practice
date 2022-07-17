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
        
        return hasPathSumUtil(root,targetSum,0);
        
    }
    
    private boolean hasPathSumUtil(TreeNode root,int targetSum,int currSum){
        if(root==null) return false;
        if(root.left==null && root.right==null && currSum+root.val ==targetSum) return true;
        if(hasPathSumUtil(root.left,targetSum,currSum+root.val)) return true;
        if(hasPathSumUtil(root.right,targetSum,currSum+root.val)) return true;
        return false;
        
        
    }
    
}