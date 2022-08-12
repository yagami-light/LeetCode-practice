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
class Solution {
    public ListNode removeElements(ListNode head, int val) {
        
        
        return helper(head,val);
    }
    
    private ListNode helper(ListNode head,int val){
        if(head==null) return null;
        // System.out.println(" head value is  :"+head.val);
                ListNode secondNode=head.next;

        if(head.val==val) return helper(secondNode,val);
        head.next=helper(secondNode,val);
        return head;
        
    }
    
}