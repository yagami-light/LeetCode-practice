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
        if(root==null)
            return false;
        // int currSum=0;
        Deque<Pair<TreeNode,Integer>> stack=new LinkedList();
        stack.add(new Pair(root,root.val));
        while(!stack.isEmpty()){
            
           Pair<TreeNode,Integer> pair=stack.pop();
           int currSum= pair.getValue();
            TreeNode node=pair.getKey();
            
           if(node.left==null && node.right==null && currSum==targetSum) return true;
            
            if(node.left!=null)
                stack.push(new Pair(node.left,currSum+node.left.val));
            
            if(node.right!=null){
                stack.push(new Pair(node.right,currSum+node.right.val));
            }
            
           
            
        }
        
        return false;
        
        
    }
}