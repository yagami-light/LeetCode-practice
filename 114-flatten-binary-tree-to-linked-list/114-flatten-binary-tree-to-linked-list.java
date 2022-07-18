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
    public void flatten(TreeNode root) {
        Deque<TreeNode> stack=new LinkedList();
        TreeNode prev=null;
        TreeNode curr=root;
        
        while(curr!=null || !stack.isEmpty()){
            while(curr!=null){    
            stack.push(curr);
            curr=curr.right;
                
            }
            
             curr=stack.peek();
            if(curr.left!=null && curr.left!=prev){
               
                 curr=curr.left;
            }else{
               
                
                
                 stack.pop();
                curr.left=null;
                curr.right=prev;
                prev=curr;
                curr=null;
                
            }
            
            
        }
        
    }
}