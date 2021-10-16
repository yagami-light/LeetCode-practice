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
    
    
    private TreeNode buildTreeUtil(int[] preOrder,int[] inOrder){
        int n=preOrder.length;
        Map<Integer,Integer> map=new HashMap();
        for(int i=0;i<inOrder.length;i++)
            map.put(inOrder[i],i);
        // int indexIn=map.get(preOrder[0]);
       
       return buildTreeUtil(preOrder,inOrder,0,n-1,0,map);
     
        
        
        
        
    }
      private TreeNode buildTreeUtil2(final int[] preOrder,final int[] inOrder,int inOrderIndexStart,int inOrderIndexEnd,int preOrderIndexStart,Map<Integer,Integer> cache){
        if((preOrderIndexStart>=preOrder.length || inOrderIndexStart> inOrderIndexEnd))
            return null;
        TreeNode root=new TreeNode(preOrder[preOrderIndexStart]);
        int inStartIndex=cache.get(root.val);
        
        root.left=buildTreeUtil2(preOrder,inOrder,inOrderIndexStart,inStartIndex-1,preOrderIndexStart+1,cache);
        root.right=buildTreeUtil2(preOrder,inOrder,inStartIndex+1,inOrderIndexEnd,preOrderIndexStart+1+inStartIndex-inOrderIndexStart,cache);
        
        return root;
        
        
        
        
    }
    
    private TreeNode buildTreeUtil(int[] preOrder,int[] inOrder,int inOrderIndexStart,int inOrderIndexEnd,int preOrderIndexStart,Map<Integer,Integer> map){
        System.out.println("printing index preStartIndex "+preOrderIndexStart+"inOrderIndex start "+inOrderIndexStart +"inOrder end "+inOrderIndexEnd);
        if(preOrderIndexStart >= preOrder.length ||  inOrderIndexStart>inOrderIndexEnd )
            return null;
        
        
        
        TreeNode root=new TreeNode(preOrder[preOrderIndexStart]);
        System.out.println("priting value "+root.val);
        int inStartIndex=map.get(root.val);
        
        root.left=buildTreeUtil(preOrder,inOrder,inOrderIndexStart,inStartIndex-1,preOrderIndexStart+1,map);
        root.right=buildTreeUtil(preOrder,inOrder,inStartIndex+1,inOrderIndexEnd,preOrderIndexStart+1+inStartIndex-inOrderIndexStart,map);
        
        
        return root;
        
    }
    
    
    
}