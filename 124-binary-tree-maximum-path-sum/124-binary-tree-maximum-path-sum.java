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
        
        int[] max=new int[1];
        max[0]=Integer.MIN_VALUE;
        maxPathSumUtil(root,max);
        return max[0];
        
        
    }
    
    
    private int maxPathSumUtil(TreeNode root,int[] res){
        if(root==null)
            return 0;
        
        int left=maxPathSumUtil(root.left,res);
        int right=maxPathSumUtil(root.right,res);
        
        
        int currMax=Math.max(Math.max(left,right)+root.val,root.val);
        
        int globalMax=Math.max(currMax,left+right+root.val);
        
        res[0]=Math.max(res[0],globalMax);
        
        
        return currMax;
        
        
        
    }
}