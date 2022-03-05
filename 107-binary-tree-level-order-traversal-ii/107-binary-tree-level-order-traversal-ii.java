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
    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        
        List<List<Integer>> res=new ArrayList();
        Queue<TreeNode>   queue=new LinkedList();
        if(root==null)
            return res;
        
        queue.add(root);
        
        while(!queue.isEmpty()){
            
            int size=queue.size();
            List<Integer> list=new ArrayList();
            
            for(int i=0;i<size;i++){
                TreeNode node=queue.remove();
                if(node!=null)    
                list.add(node.val);
                if(node.left!=null)
                    queue.add(node.left);
                
                if(node.right!=null)
                    queue.add(node.right);
                
                
            }
            
            res.add(0,list);
            
            
        }
        
        
        return res;
        
        
        
        
        
    }
}