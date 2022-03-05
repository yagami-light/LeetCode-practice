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
    public int maxDepth(TreeNode root) {
        if(root==null)
            return 0;
        
        Stack<TreeNode> nodeStack=new Stack();
        Stack<Integer> height=new Stack();
        
        nodeStack.add(root);
        height.add(1);
        int max=Integer.MIN_VALUE;
        while(!nodeStack.isEmpty()){
            
            TreeNode node=nodeStack.pop();
            int value=height.pop();
            max=Math.max(max,value);
            if(node.left!=null)
            {
                nodeStack.add(node.left);
                height.add(value+1);
            }
            if(node.right!=null)
            {
                nodeStack.add(node.right);
                height.add(value+1);
            }
            
            
        }
        
        
        return max;
        
        
    }
}