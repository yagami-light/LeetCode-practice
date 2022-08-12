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
    public List<Integer> rightSideView(TreeNode root) {
        List<Integer> res=new ArrayList();
        List<List<Integer>> state =new ArrayList();
         helper(root,res,state,0);
        return res;
    }
    private void helper(TreeNode root,List<Integer> res,List<List<Integer>> state,int height){
        if(root==null) return;
        
        if(height>=state.size()){
            state.add(new LinkedList());
            res.add(root.val);
        }
        state.get(height).add(root.val);
        helper(root.right,res,state,height+1);

        helper(root.left,res,state,height+1);
        
        
        
    }
    
}