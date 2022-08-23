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
    public List<String> binaryTreePaths(TreeNode root) {
        List<String> res=new ArrayList();
         helper(root,"",res);
        return res;
    }
    
    private void helper(TreeNode root,String currString,List<String> res){
        if(root==null) return;
        if(root.left==null && root.right==null){
            currString += currString.isEmpty() ? (""+root.val) : "->"+root.val;
            res.add(currString);
            return;
        }
        currString+=currString.isEmpty() ? root.val : "->"+root.val;
        
        helper(root.left,currString,res);
         helper(root.right,currString,res);
        
        
    }
    
}