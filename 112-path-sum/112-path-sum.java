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
        Deque<TreeNode> stack=new LinkedList();
        TreeNode curr=root;
        int currSum=0;
        TreeNode prev=null;
        while(!stack.isEmpty() || curr!=null){
            
            
            while(curr!=null){
                 currSum+=curr.val;
                stack.push(curr);
                curr=curr.left;
            }
            
                           
                           
             curr=stack.peek();
            // int value=pair.getValue();
            // TreeNode node=pair.getKey();
            if(curr.left==null && curr.right==null && currSum==targetSum)
                           return true;
                           
            if(curr.right!=null && curr.right!=prev)               
            curr=curr.right;               
            else{
                prev=curr;
                stack.pop();
                currSum-=curr.val;
                curr=null;
                
                
                
            }
            
            
        }
        return false;
        
        
        
    }
}