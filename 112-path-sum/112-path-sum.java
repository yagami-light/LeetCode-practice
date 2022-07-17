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
        
        
        Queue<Pair<TreeNode,Integer>> queue=new LinkedList();
        queue.add(new Pair(root,root.val));
        while(!queue.isEmpty()){
            
            Pair<TreeNode,Integer> pair=queue.remove();
            TreeNode node=pair.getKey();
            if(node.left==null && node.right==null && pair.getValue()==targetSum) return true;
            
            if(node.left!=null)
                queue.add(new Pair(node.left,pair.getValue()+node.left.val));
            
             if(node.right!=null)
                queue.add(new Pair(node.right,pair.getValue()+node.right.val));
            
            
                
        }
        
        
        return false;
        
    }
}