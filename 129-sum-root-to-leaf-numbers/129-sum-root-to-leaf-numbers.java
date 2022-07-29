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
    public int sumNumbers(TreeNode root) {
        List<String> res=new ArrayList();
        int total=0;
        preOrder(root,"",res);
        for(String str:res){
            total+=Integer.parseInt(str);
        }
        
        // System.out.println("print array :"+res);
        return total;
        
    }
    
    private void preOrder(TreeNode root,String currString,List<String> res){
        if(root.left==null && root.right==null) {
            res.add(currString+root.val);
            return;
        }
        if(root.left!=null)
        preOrder(root.left,currString+root.val,res);
                if(root.right!=null)

         preOrder(root.right,currString+root.val,res);
        
        
    }
    
}