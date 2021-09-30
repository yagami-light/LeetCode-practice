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
        
        return mergeTreesUtil(r1,r2);
    }
    
    
    private TreeNode mergeTreesUtil(TreeNode r1,TreeNode r2){
        
        if(r1==null && r2==null)
            return null;
        if(r1==null && r2!=null)
            return r2;
        if(r1!=null && r2==null)
            return r1;
        
        
        else{
            
            TreeNode root=new TreeNode(r1.val+r2.val);
            root.left=mergeTreesUtil(r1.left,r2.left);
            root.right=mergeTreesUtil(r1.right,r2.right);
            
            return root;
            
        }
        
    }
    
    
}