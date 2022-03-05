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
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        int n=inorder.length;
        Map<Integer,Integer> map=new HashMap();
        for(int i=0;i<n;i++){
            
            map.put(inorder[i],i);
            
            
        }
        
        return buildTree(preorder,inorder,0,inorder.length-1,0,map);
        
    }
    
    private TreeNode buildTree(int[] preorder,int[] inorder,int instart,int inend,int prestart,Map<Integer,Integer> map){
        
        if(instart>inend && prestart> inend)
            return null;
        
        // System.out.println("prestart "+prestart);
        
        int inIndex=map.get(preorder[prestart]);
        
        TreeNode node=new TreeNode(preorder[prestart]);
        node.left=buildTree(preorder,inorder,instart,inIndex-1,prestart+1,map);
        node.right=buildTree(preorder,inorder,inIndex+1,inend,prestart+1+inIndex-instart,map);      
        
        return node;
            
        
        
    }
    
    
    
    
}