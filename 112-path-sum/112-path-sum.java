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
    public boolean hasPathSum(TreeNode root, int targetSum) {
        if(root==null) return false;
     
        Deque<TreeNode> nodeStack=new LinkedList();
        Deque<Integer> valueStack=new LinkedList();
        TreeNode curr=root;     
        int total=0;
        while(curr!=null || !nodeStack.isEmpty()){
            
            while(curr!=null){
                nodeStack.push(curr);
                total+=curr.val;
                valueStack.push(total);
                curr=curr.left;
            }
            
            
            curr=nodeStack.pop();
            // System.out.println("curr value  is :"+curr.val);
            total=valueStack.pop();
            if(curr.left==null && curr.right==null && total==targetSum) return true;
            
            curr=curr.right;
            
            
            
            
        }
        
        return false;
        
    }
}