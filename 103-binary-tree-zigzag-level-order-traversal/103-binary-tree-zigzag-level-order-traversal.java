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
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> res=new ArrayList();
        if(root==null)
            return res;
        Queue<TreeNode> queue=new LinkedList();
        boolean isEven=false;
        queue.add(root);
        
        while(!queue.isEmpty()){
            System.out.println(queue.size());
            int size=queue.size();
            List<Integer> list=new ArrayList();
            for(int i=0;i<size;i++){
                // System.out.println(i);
                TreeNode node=queue.remove();
                if(root!=null){
                    if(!isEven)
                    list.add(node.val);
                else
                    list.add(0,node.val);
                }
                if(node.left!=null)
                    queue.add(node.left);
                if(node.right!=null)
                    queue.add(node.right);
                
            }
            
            isEven=!isEven;
            
            
            res.add(list);
            
            
            
        }
        
        
        return res;
        
        
        
        
    }
}