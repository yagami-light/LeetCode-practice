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
        Deque<Pair<TreeNode,Integer>> stack=new LinkedList();
        if(root==null)
            return false;
        
        stack.push(new Pair(root,root.val));
        while(!stack.isEmpty()){
            Pair<TreeNode,Integer> pair=stack.pop();
            
            TreeNode node=pair.getKey();
            int value=pair.getValue();
            
            if(node.left==null && node.right==null && value==targetSum)
                return true;
            if(node.left!=null)
            stack.push(new Pair(node.left,value+node.left.val));
            
             if(node.right!=null)
            stack.push(new Pair(node.right,value+node.right.val));
            
            
            
            
        }
        
        return false;
        
        
    }
}