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
    public boolean isSymmetric(TreeNode root) {
        Queue<TreeNode> stack1=new LinkedList();
        LinkedList<TreeNode> stack2=new LinkedList();
        
        if(root==null) return true;
        if(root!=null && root.left==null && root.right==null) return true;
        TreeNode leftNode=root.left;
        TreeNode rightNode=root.right;
        stack1.add(leftNode);
        stack2.add(rightNode);
        while(!stack1.isEmpty() && !stack2.isEmpty()){
            
            int size1=stack1.size();
            int size2=stack2.size();
            if(size1!=size2) return false;
            TreeNode node1=stack1.remove();
            TreeNode node2=stack2.remove();
            // System.out.println("value left node :"+node1.val+" value right node :"+node2.val);
            if(node1==null && node2==null) return true;
            if(node1==null || node2==null) return false;
            if(node1.val!=node2.val) return false;
            if(node1.left!=null)
                stack1.add(node1.left);
            if(node2.right!=null)
                stack2.add(node2.right);
            
            if(stack1.size()!=stack2.size()) return false;
            if(node1.right!=null)
                stack1.add(node1.right);
            if(node2.left!=null)
                stack2.add(node2.left);
            
        }
        
        return stack1.size()==stack2.size();
        
    }
}