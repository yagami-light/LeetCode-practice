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
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> res=new ArrayList();
        Deque<TreeNode> stack=new LinkedList();
        TreeNode curr=root;
        while(!stack.isEmpty() || curr!=null){
            
            while(curr!=null){
                stack.push(curr);
                curr=curr.left;
                
                
            }
            curr=stack.pop();
            res.add(curr.val);
            curr=curr.right;
            
        }
        
        return res;
    }
}