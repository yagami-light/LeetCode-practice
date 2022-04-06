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
    public List<Double> averageOfLevels(TreeNode root) {
        List<Double> res=new ArrayList();
        if(root==null)
            return res;
        
        Queue<TreeNode> queue=new LinkedList();
        queue.add(root);
        
        while(!queue.isEmpty()){
            
            int size=queue.size();
            double sum=0;
            for(int i=0;i<size;i++){
                
                TreeNode node=queue.remove();
                
                if(node.left!=null)
                    queue.add(node.left);
                
                if(node.right!=null)
                    queue.add(node.right);
                sum+=node.val;
                
            }
            
            res.add(sum/size);
            
            
        }
        
        return res;
        
        
    }
}