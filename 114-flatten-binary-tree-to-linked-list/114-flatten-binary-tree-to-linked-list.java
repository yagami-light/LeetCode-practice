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
    public void flatten(TreeNode root) {
        
        
         preorderUtil(root);
        
    }
    
    private TreeNode preorderUtil(TreeNode root){
        System.out.println("alex");
        if(root==null) return null;
        
        TreeNode preleft=preorderUtil(root.left);
        TreeNode preright=preorderUtil(root.right);
        
        root.left=null;
        root.right=preleft;
        TreeNode curr=root;
        TreeNode prev=null;
        while(curr!=null){
            // System.out.println("preleft is :"+curr.val);
            prev=curr;
            curr=curr.right;
        
        }
        prev.right=preright;
        
        return root;
        
        
    }
    
    
}