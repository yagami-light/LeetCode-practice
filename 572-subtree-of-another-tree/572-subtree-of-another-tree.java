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
    public boolean isSubtree(TreeNode root, TreeNode subRoot) {
        
        
        return isSubTreeUtil(root,subRoot);
        
    }
    
    private boolean isSubTreeUtil(TreeNode root, TreeNode subRoot){
        
        if(subRoot==null)
            return true;
        
        if(root == null && subRoot !=null)
            return false;
        
        
        return isSameTree(root,subRoot) || isSubTreeUtil(root.left,subRoot) || isSubTreeUtil(root.right,subRoot);
        
        
    }
    
    
    private boolean isSameTree(TreeNode r,TreeNode s){
        if(r==null && s==null)
            return true;
        
        if(r==null || s==null)
            return false;
        
        return r.val == s.val && isSameTree(r.left,s.left) && isSameTree(r.right,s.right);
        
    }
    
    
    
}