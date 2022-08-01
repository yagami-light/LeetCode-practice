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
    public List<Integer> postorderTraversal(TreeNode root) {
        return helper(root);
    }
    
    private List<Integer> helper(TreeNode root){
        List<Integer> res=new ArrayList();
        if(root==null){
            return res;
        }
        
        res.addAll(helper(root.left));
        res.addAll(helper(root.right));
        res.add(root.val);
        
        return res;
        
        
        
    }
    
    
}