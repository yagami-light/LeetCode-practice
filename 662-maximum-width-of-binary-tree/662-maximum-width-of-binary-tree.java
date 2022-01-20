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
    
    Map<Integer,Integer> leftmost_depth_poistion;
    int max;
    
    
    public int widthOfBinaryTree(TreeNode root) {
        leftmost_depth_poistion=new HashMap();
        
        maxWidth(root,0,0);
        
        return max;
    }
    
    
    private void maxWidth(TreeNode root, int depth, int posistion){
        if(root==null)
            return;
        
        leftmost_depth_poistion.computeIfAbsent(depth,x->posistion);
        
        max=Math.max(max,(posistion-leftmost_depth_poistion.get(depth)+1));
        maxWidth(root.left,depth+1,posistion * 2);
        maxWidth(root.right,depth+1,(posistion * 2) +1);

        
        
        
        
    }
    
    
    
    
}