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
        
        int[] result=new int[1];
        result[0]=Integer.MIN_VALUE;
        maxPathSumUtil(root,result);
        
        return result[0];
        
    }
    
    
    private int maxPathSumUtil(final TreeNode root,final int[] result){
            if(root==null)    
            return 0;
            int left =maxPathSumUtil(root.left,result);
            int right=maxPathSumUtil(root.right,result);
            int maxCurrent=Math.max(Math.max(left,right)+root.val,root.val);
        
            int maxSum=Math.max(maxCurrent,(left+root.val+right));
        
            int maxGlobal=result[0];
            maxGlobal=Math.max(maxGlobal,maxSum);
        
            result[0]=maxGlobal;
        
        
            return maxCurrent;
        
        
    }
    
    
}