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
    public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
        
         List<List<Integer>> res=new ArrayList();
        pathSum(root,targetSum,res,new ArrayList());
        return res;
        
    }
    
    private void pathSum(TreeNode root, int targetSum,List<List<Integer>> res,List<Integer> currList){
        if(root==null)
            return;
        currList.add(root.val);
        if(root.left == null && root.right == null && root.val == targetSum){
            res.add(new ArrayList(currList));
            // return;
        }
            
        // currList.add(root.val);
        pathSum(root.left,targetSum-root.val,res,currList);
        pathSum(root.right,targetSum-root.val,res,currList);
        currList.remove(currList.size()-1);
    }
    
    
}