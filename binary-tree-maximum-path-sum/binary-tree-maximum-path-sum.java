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
    public int maxPathSum(TreeNode root) {
        int[] maxSum=new int[1];
        maxSum[0]=Integer.MIN_VALUE;
        maxPathSumUtil(root,maxSum);
        
        return maxSum[0];
        
    }
    
    
    private int maxPathSumUtil(TreeNode root,int []maxSum){
        if(root==null)
            return 0;
        
        
        
        int left=maxPathSumUtil(root.left,maxSum);
        int right=maxPathSumUtil(root.right,maxSum);
        
        int currentMax=Math.max(Math.max(left,right)+root.val,root.val);
        
        int globalMax=Math.max(currentMax,left+right+root.val);
        
        maxSum[0]=Math.max(globalMax,maxSum[0]);
        
        return currentMax;
        
    }
    
    
    
}