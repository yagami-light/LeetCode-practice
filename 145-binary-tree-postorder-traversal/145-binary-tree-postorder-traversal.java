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
        Stack<TreeNode> stack=new Stack();
        LinkedList<Integer> res=new LinkedList();
        TreeNode curr=root;
        while(!stack.isEmpty()|| curr!=null){
            if(curr!=null){
                stack.push(curr);
                 res.addFirst(curr.val);
                curr=curr.right;
            }else{
                curr=stack.pop();
                curr=curr.left;
            }
           
            
        }
        
        return res;
        
        
    }
}