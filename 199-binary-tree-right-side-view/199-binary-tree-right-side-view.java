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
        
        Set<Integer> set=new HashSet();
        rightSideViewUtil(root,0,res,set);
        return res;
        
        
        
    }
    
    private void rightSideViewUtil(TreeNode root,int level,List<Integer>  res,Set<Integer> set){
        if(root==null)
            return;
        
        if(!set.contains(level)){
            res.add(root.val);
            set.add(level);
        }
        
        rightSideViewUtil(root.right,level+1,res,set);
        rightSideViewUtil(root.left,level+1,res,set);

    }
    
    
    
}