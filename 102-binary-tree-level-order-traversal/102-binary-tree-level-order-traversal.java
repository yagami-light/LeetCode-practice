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
    public List<List<Integer>> levelOrder(TreeNode root) {
         List<List<Integer>> res=new ArrayList();
        dfs(root,res,0);
        return  res;
        
    }
    
    private void dfs(TreeNode root,  List<List<Integer>>    res,int height){
        if(root==null)
            return;
        
        if(height>=res.size())
            res.add(new LinkedList());    
        res.get(height).add(root.val);
        dfs(root.left,res, height+1);
        dfs(root.right,res ,height+1);
        
        
    }
    
    
}