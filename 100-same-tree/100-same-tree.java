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
    public boolean isSameTree(TreeNode p, TreeNode q) {
        
        Stack<TreeNode> stack1=new Stack();
        Stack<TreeNode> stack2=new Stack();
        if(p != null)
            stack1.add(p);
        if(q!=null)
            stack2.add(q);
        
        while(!stack1.isEmpty() && !stack2.isEmpty()){
            
            TreeNode pn=stack1.pop();
            TreeNode qn=stack2.pop();
            if(pn.val != qn.val )
                return false;
            
            if(pn.left !=null)
                stack1.add(pn.left);
            
            if(qn.left != null)
                stack2.add(qn.left);
            
            if(stack1.size() != stack2.size())
                return false;
            
              if(pn.right !=null)
                stack1.add(pn.right);
            
            if(qn.right != null)
                stack2.add(qn.right);
            
            if(stack1.size() != stack2.size())
                return false;
            
            
            
            
        }
        
        
        
        return stack1.size() == stack2.size();
        
    }
}