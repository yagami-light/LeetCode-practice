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
    public TreeNode buildTree(int[] preOrder, int[] inOrder) {
        
        return buildTreeUtil(preOrder,inOrder);
    }
    
    
    private TreeNode buildTreeUtil(final int[] preOrder, int[] inOrder){
        
        Map<Integer,Integer> indexCache=new HashMap();
        for(int i=0;i<inOrder.length;i++)
            indexCache.put(inOrder[i],i);
        
        return buildTreeUtil(preOrder,inOrder,0,inOrder.length-1,0,indexCache);
        
        
    }
    
    
    
    private TreeNode buildTreeUtil(final int[] preOrder,int[] inOrder,int inStart,int inEnd, int preIndexStart,Map<Integer,Integer> indexCache){
        if((preIndexStart>= preOrder.length) || (inStart>inEnd))
        return null;
        TreeNode root=new TreeNode(preOrder[preIndexStart]);
        int inStartIndex=indexCache.get(root.val);

        root.left=buildTreeUtil(preOrder,inOrder,inStart,inStartIndex-1,preIndexStart+1,indexCache);
        root.right=buildTreeUtil(preOrder,inOrder,inStartIndex+1,inEnd,preIndexStart+1+inStartIndex-inStart,indexCache);
        
        
        
        return root;
        
        
        
    }
    
}