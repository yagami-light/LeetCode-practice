/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
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
    public TreeNode sortedListToBST(ListNode head) {
        
        if(head==null) return null;
        ListNode end=null;
        return helper(head,end);
        
        
    }
    
    private TreeNode helper(ListNode head,ListNode end){
        if(head ==end )
            return null;
        ListNode prev=null;
        ListNode nextToCurr=null;
        
        ListNode slow=head;
        ListNode fast=head;
        
        while(fast!=end && fast.next!=end){
            fast=fast.next.next;
            // fast=fast.next;
            prev=slow;
            slow=slow.next;
            
            
        }
        nextToCurr=slow.next;
        // System.out.println("slow value :"+slow.val);
        
        TreeNode node=new TreeNode(slow.val);
        node.left=helper(head,slow);
        node.right=helper(nextToCurr,end);
        
        return node;
        
    }
    
    
}