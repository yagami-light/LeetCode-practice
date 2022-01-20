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
        
        Map<Integer,Integer> map=new HashMap();
        
        for(int i=0;i<inorder.length;i++){
            map.put(inorder[i],i);
        }
        
        
        return buildTree(preorder,inorder,0,inorder.length-1,0,map);
        
    }
    
    
    private TreeNode buildTree(int[] preorder,int[] inorder,int inIndexStart,int inIndexEnd,int preIndex,Map<Integer,Integer> map){
        
        if(preIndex>=preorder.length || inIndexStart > inIndexEnd)
            return null;
        
        
        TreeNode node=new TreeNode(preorder[preIndex]);
        int inIndexEndCalc=map.get(node.val);
        
        node.left=buildTree(preorder,inorder,inIndexStart,inIndexEndCalc-1,preIndex+1,map);
        node.right=buildTree(preorder,inorder,inIndexEndCalc+1,inIndexEnd,preIndex+1+(inIndexEndCalc-inIndexStart),map);
        
        return node;
        
        
        
        
    }
    
}