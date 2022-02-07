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
    public TreeNode buildTree(int[] pre, int[] in) {
        
        Map<Integer,Integer> map=new HashMap();
        for(int i=0;i<in.length;i++){
            map.put(in[i],i);
        }
        
        
        return buildTreeUtil(pre,in,0,in.length-1,0,map);
        
    }
    
    
    private TreeNode buildTreeUtil(int[] pre,int[] in,int inStart,int inEnd,int preStart,Map<Integer,Integer> map){
        
        if(inStart> inEnd && preStart>inEnd)
            return null;
        
        int inCalc=map.get(pre[preStart]);
        
        TreeNode node=new TreeNode(pre[preStart]);
        
        node.left=buildTreeUtil(pre,in,inStart,inCalc-1,preStart+1,map);
        node.right=buildTreeUtil(pre,in,inCalc+1,inEnd,preStart+inCalc-inStart+1 ,map);
        
        return node;
        
    }
}