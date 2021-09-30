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
    
    
    private boolean isSubTreeUtil(TreeNode root,TreeNode subRoot){
        if(root==null && subRoot==null)
            return true;
        
        if(root==null && subRoot != null)
            return false;
        else{
              
                return isSameTree(root,subRoot) || isSubTreeUtil(root.left,subRoot) || isSubTreeUtil(root.right,subRoot) ; 
            
        }
        
        
    }
    
    private boolean isSameTree(TreeNode p,TreeNode q){
        if(p == null && q == null)
            return true;
        if(p==null || q==null )
            return false;
        
        return p.val ==q.val && isSameTree(p.left,q.left) && isSameTree(p.right,q.right);
    }
}