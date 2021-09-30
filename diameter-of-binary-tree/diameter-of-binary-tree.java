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
    public int diameterOfBinaryTree(TreeNode root) {
        int[] max=new int[1];
         diameterOfBinTree(root,max);
        return max[0];
        
    }
    
    
    private int diameterOfBinTree(TreeNode root,int[] max){
        if(root==null)
            return 0;
        
        int left=diameterOfBinTree(root.left,max);
        int right=diameterOfBinTree(root.right,max);
        
        max[0]=Math.max(max[0],left+right);
        
        return Math.max(left,right)+1;
        
        
        
        
        
    }
}