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
    public boolean isValidBST(TreeNode root) {
        if(root==null)
            return true;
        
        TreeNode  prev=null;
        Stack<TreeNode> stack=new Stack();
        
        while(root!=null || !stack.isEmpty()){
            
            
        while(root!=null){
            stack.add(root);
            root=root.left;
        }
            
            root=stack.pop();
            // list.add(root.val);
            if(root!=null && prev !=null && root.val<= prev.val)
                return false;
            prev=root;
            root=root.right;
            
        }
        
        
        
        return true;
        
        
    }
}