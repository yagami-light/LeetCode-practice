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
    public int kthSmallest(TreeNode root, int k) {
        int[] res=new int[2];
        inorder(root,k,0,res);
        
        return res[0];
        
        
        
    }
    
    private void inorder(TreeNode root,int k,int count,int[] res){
        if(root==null)
            return;
        
        inorder(root.left,k,count,res);
        
             res[1]++;
        // System.out.println("root value "+root.val+" count "+res[1]);
        if(res[1]==k)
            res[0]=root.val;
   
        inorder(root.right,k,count,res);
        
        
        
    }
    
}