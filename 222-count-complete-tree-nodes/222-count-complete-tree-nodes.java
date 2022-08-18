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
    public int countNodes(TreeNode root) {
        if(root==null) return 0;
        // int left=height(root,true);
        // int right=height(root,false);
        int left=getHeightLeft(root);
        int right=getHeightRight(root);
        if(left==right) return (2<<left)-1;
        else
            return countNodes(root.left)+countNodes(root.right)+1;
        
        
    }
      public int getHeightLeft(TreeNode root){
       if(root.left==null) return 0;
    else return 1+getHeightLeft(root.left);
    }
    
    
    public int getHeightRight1(TreeNode root){
        int count=0;
        while(root.right!=null){
            count++;
            root = root.right;
        }
        return count;
    }
    public int getHeightRight(TreeNode root){
    if(root.right==null) return 0;
        else
            return 1+getHeightRight(root.right);
    }
    
    private int height(TreeNode root,boolean isLeft){
        
        if(root==null) return 0;
        else
            return 1+(isLeft ? height(root.left,isLeft) : height(root.right,isLeft));
        
    }
    
}