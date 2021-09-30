/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */

class Solution {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        
        return lcaUtil(root,p,q);
    }
    
    
    private TreeNode lcaUtil(TreeNode root, TreeNode p,TreeNode q){
        if(root == null)
            return null;
        else if(root != null && p == null && q == null)
            return root;
        else{
            
            if(root.val < p.val && root.val <q.val)
                return lcaUtil(root.right,p,q);
            if(root.val > p.val && root.val >q.val)
                return lcaUtil(root.left,p,q);
            return root;
            
        }
    }
}