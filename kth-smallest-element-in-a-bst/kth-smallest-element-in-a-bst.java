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
        result[1]=0;
         kthSamallestUtil(root,k,result);
        
        return result[0];
    }
    
    private void kthSamallestUtil(TreeNode root, int k,int[] result){
        if(null==root)
            return;
        
        else{
            
            
            kthSamallestUtil(root.left,k,result);
             result[1]++;
            if(result[1]==k)
                
             {   
                
                 result[0]=root.val;
                return;
              }
           
            
            
            kthSamallestUtil(root.right,k,result);
            
            
        }
        
        
        
       // return -1;
        
    }
    
    
}