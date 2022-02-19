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
    public TreeNode mergeTrees(TreeNode r1, TreeNode r2) {
        
       if(r1==null && r2==null)
           return null;
        else if(r1==null && r2!=null){
            return r2;
        }else if(r1!=null && r2==null){
            return r1;
        }
            
        else{
            
            return new TreeNode(r1.val + r2.val,mergeTrees(r1.left,r2.left),mergeTrees(r1.right,r2.right));
            
            
            
        }
        
        
        
        
        
        
    }
}