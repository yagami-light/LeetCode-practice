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
    public List<Integer> preorderTraversal(TreeNode root) {
        
         List<Integer> res=new ArrayList();
        if(root==null) return res;
        Stack<TreeNode> queue=new Stack();
        queue.add(root);
        // res.add(root.val);
        while(!queue.isEmpty()){
            TreeNode node=queue.pop();
            res.add(node.val);
            if(node.right!=null){
                queue.push(node.right);
                // res.add(node.right.val);
            }
           
            if(node.left!=null){
                queue.push(node.left);
                // res.add(node.left.val);
                
            }
             
        }
        
        return res;
        
    }
}