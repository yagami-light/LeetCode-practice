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
        int[] result=new int[2];
         kthSmallestUtil(root,k,0,result);
        return result[0];
    }
    
    
    private void kthSmallestUtil(TreeNode root, int k,int count,int[] result){
        if(root==null)
            return;
        else{
            
             kthSmallestUtil(root.left,k,count,result);
                                    result[1]++;

            if(k==result[1]){
                result[0]=root.val;
                return;
            }

            
            
                 kthSmallestUtil(root.right,k,count,result);
            
        }
        
        
        
        
        
        
    }
    
}