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
    
    TreeNode previousNode;
    
    public boolean isValidBST(TreeNode root) {
        
        return isValidBSTUtil(root);
    }
    
    
    private boolean isValidBSTUtil(TreeNode root){
        if(root==null)
            return true;
        boolean res=true;
        if(!isValidBSTUtil(root.left)) return false;
        if(previousNode !=null && root!= null && previousNode.val >=root.val)
            return false;
        previousNode=root;
        if(!isValidBSTUtil(root.right)) return false;
        
       
        return true;
        
    }
    
    
    
}