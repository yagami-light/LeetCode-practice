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
    public TreeNode invertTree(TreeNode root) {
        return invertTreeUtil(root);
    }
    
    
    private TreeNode invertTreeUtil(final TreeNode root){
        
        if(root==null || (root.left==null && root.right==null))
            return root;
        
        else{
            
            return new TreeNode(root.val,invertTreeUtil(root.right),invertTreeUtil(root.left));
            
        }
        
        
        
        
    }
    
    
}