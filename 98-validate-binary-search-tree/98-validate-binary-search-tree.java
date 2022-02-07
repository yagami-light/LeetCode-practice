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
    TreeNode pr;
    public boolean isValidBST(TreeNode root) {
        
        
        return isValidBSTUtil(root,null);
        
    }
    
    private boolean isValidBSTUtil(TreeNode root,TreeNode prev){
        if(root==null)
            return true;
        
        
        
        if(!isValidBSTUtil(root.left,prev))
            return false;
        if(pr!= null && root != null && pr.val >= root.val)
            return false;
        
        pr=root;
        
        if(!isValidBSTUtil(root.right,prev))
            return false;
        
        
        return true;
        
        
        
    }
    
    
    
}