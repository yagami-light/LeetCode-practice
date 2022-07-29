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
    public int sumNumbers(TreeNode root) {
        Stack<TreeNode>  nodeStack=new Stack();
        Stack<String>  valueStack=new Stack();
        int sum=0;
        nodeStack.push(root);
        valueStack.push(""+root.val);
        while(!nodeStack.isEmpty()){
            
            TreeNode node=nodeStack.pop();
            String value=valueStack.pop();
            if(node.left!=null){
                valueStack.push(value+node.left.val);
                nodeStack.push(node.left);
                
            }
            if(node.right!=null){
                valueStack.push(value+node.right.val);

                nodeStack.push(node.right);
            }
            
            if(node.left==null && node.right==null){
                // System.out.println("alex");
                sum+=Integer.valueOf(value);
                
            }
            
            
            
            
        }
        
        
        return sum;
        
    }
}