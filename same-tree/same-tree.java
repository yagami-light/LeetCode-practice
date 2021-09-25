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
    public boolean isSameTree(TreeNode p, TreeNode q) {
        
            return isSameTreeUtil(p,q);        
    }
    
    private boolean isSameTreeUtil(final TreeNode p,final TreeNode q){
        if(p==null && q==null)
            return true;
        else if(p==null || q==null)
            return false;
        else {
            
            
            return p.val==q.val && (isSameTreeUtil(p.left,q.left) && (isSameTreeUtil(p.right,q.right)));
            
            
            
        }
        
        
        
        
    }
    
    
}