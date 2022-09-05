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

// PostOrdr : left ,right ,root;

class Solution {
    public List<Integer> postorderTraversal(TreeNode root) {
        
        List<Integer> res=new ArrayList();
        Deque<TreeNode> stack=new LinkedList();
        TreeNode curr=root;
        while(!stack.isEmpty() || curr!=null){
            
            while(curr!=null){
            stack.push(curr);
            res.add(0,curr.val);
            curr=curr.right;
                
            }
            
            curr=stack.pop();
            curr=curr.left;
            
            
        }
        
        return res;
        
    }
}