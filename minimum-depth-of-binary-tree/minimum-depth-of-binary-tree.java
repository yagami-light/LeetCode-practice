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
    public int minDepth(TreeNode root) {
        return minDepthUtil(root);
        // return depth[0];
    }
    
    public int minDepthUtil(TreeNode root){
        if(root==null){
            return 0;
        
        }
      
        int left=minDepthUtil(root.left);
        int right=minDepthUtil(root.right);
        return   (left==0 ||right ==0) ? left+right+1 : Math.min(left,right)+1;
    }
    
}