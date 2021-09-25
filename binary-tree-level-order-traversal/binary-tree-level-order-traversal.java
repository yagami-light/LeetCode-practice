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
        
        return levelOrderUtil(root);
    }
    
    
    private List<List<Integer>> levelOrderUtil(final TreeNode root){
       List<List<Integer>> result=new ArrayList();
       Queue<TreeNode> queue=new LinkedList(); 
       if(root==null)
           return result;
        else
        queue.add(root);
        
        
       while(!queue.isEmpty()){
           int size=queue.size();
           List<Integer> list=new ArrayList();
           for(int level=0;level<size;level++){
               TreeNode node=queue.remove();
             
                   if(node.left!=null) 
                   queue.add(node.left);
                    if(node.right!=null) 
                   queue.add(node.right);
                   list.add(node.val);
                
       } 
            result.add(list);
        
        
      
        
    }
         return result; 
}
}