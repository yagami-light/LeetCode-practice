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
    
    public List<String> binaryTreePaths(TreeNode root) {
        List<String> res=new ArrayList();
        
        Queue<TreeNode> queueNode=new LinkedList();
        Queue<String> queueStr=new LinkedList();
        queueNode.add(root);
        queueStr.add("");
        
        while(!queueNode.isEmpty()){
            
            TreeNode currNode=queueNode.remove();
            String currStr=queueStr.remove();
            
            if(currNode.left==null && currNode.right==null){
                res.add(currStr+currNode.val);
            }
            if(currNode.left!=null){
                queueNode.add(currNode.left);
                queueStr.add(currStr+currNode.val+"->");
            }
             if(currNode.right!=null){
                queueNode.add(currNode.right);
                queueStr.add(currStr+currNode.val+"->");
            }
            
            
            
        }
        
        return res;
        
        
    }
    
    
    
   /* 
    public List<String> binaryTreePaths(TreeNode root) {
    List<String> list=new ArrayList<String>();
    Queue<TreeNode> qNode=new LinkedList<TreeNode>();
    Queue<String> qStr=new LinkedList<String>();
    
    if (root==null) return list;
    qNode.add(root);
    qStr.add("");
    while(!qNode.isEmpty()) {
        TreeNode curNode=qNode.remove();
        String curStr=qStr.remove();
        
        if (curNode.left==null && curNode.right==null) list.add(curStr+curNode.val);
        if (curNode.left!=null) {
            qNode.add(curNode.left);
            qStr.add(curStr+curNode.val+"->");
        }
        if (curNode.right!=null) {
            qNode.add(curNode.right);
            qStr.add(curStr+curNode.val+"->");
        }
    }
    return list;
}
  */  
}