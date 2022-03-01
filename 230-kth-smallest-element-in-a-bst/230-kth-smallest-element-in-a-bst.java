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
    public int kthSmallest(TreeNode root, int k) {
        // PriorityQueue<TreeNode> pq=new PriorityQueue<>(Comparator.comparingInt(node->node.val).reverseOrder());
        
         PriorityQueue<Integer> pq=new PriorityQueue<>(k,Collections.reverseOrder());
        
        inOrder(root,pq,k);
        return pq.peek();
    }
    
    private void inOrder(TreeNode root,PriorityQueue<Integer> pq,int k){
        if(root==null)
            return;
        
        inOrder(root.left,pq,k);
        
        pq.add(root.val);
        if(pq.size()>k)
            pq.remove();
        
        inOrder(root.right,pq,k);
        
        
    }
    
    
}


/*
1,2,3,4,5,6





4
3
2

*/