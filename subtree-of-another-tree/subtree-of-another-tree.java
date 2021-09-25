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
    
    private boolean isSubTreeUtil(final TreeNode root,final TreeNode subRoot){
        
        if(root==null && subRoot==null)
            return true;
        if(root==null && subRoot!=null)
            return false;
        if(root!=null && subRoot==null)
            return true;
        
        else{
            
            if(root.val==subRoot.val && isSameTree(root,subRoot))
                return true;
            else{
           return  isSubTreeUtil(root.left,subRoot) || isSubTreeUtil(root.right,subRoot);
            
            
            }
            
            
        }
        
        
    }
    
    
    private boolean isSameTree(final TreeNode p,final TreeNode q){
        if(p==null && q==null)
            return true;
        else if(p==null || q==null)
            return false;
        
        else return p.val==q.val && isSameTree(p.left,q.left) && isSameTree(p.right,q.right);
        
        
        
    }
    
    
    
}