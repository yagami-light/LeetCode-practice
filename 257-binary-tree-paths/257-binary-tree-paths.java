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
        if(root==null) return res;
        if(root.left==null && root.right==null){
            res.add(Integer.toString(root.val));
            return res;   
        }
        
        for(String str:binaryTreePaths(root.left)){
            res.add(Integer.toString(root.val)+"->"+str);
        }
         for(String str:binaryTreePaths(root.right)){
            res.add(Integer.toString(root.val)+"->"+str);
        }
        
        return res;
        
    }
}