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
    TreeNode prev;
    Boolean isBST=true;
    public boolean isValidBST(TreeNode root) {
        return         isValidBSTUtil(root);

        
    }
    
    
    private boolean isValidBSTUtil(TreeNode root){
        if(root==null){
           
            return true;
            
        }
        else{
            
            if(!isValidBSTUtil(root.left)) 
                return false;
            if(root!=null && prev!=null && prev.val >= root.val)
                return false;
            prev=root;
            if(!isValidBSTUtil(root.right)) 
                return false;
        }
        
       return true; 
    }
}