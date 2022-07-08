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
    public ListNode reverseBetween(ListNode head, int left, int right) {
        ListNode dummy=new ListNode(-1);
        dummy.next=head;
        ListNode curr=head;
        ListNode prev=dummy;
        int i=1;
        while(i<left){
            
            prev=curr;
            curr=curr.next;
            i++;
            
        }
        ListNode node=prev;
        
        while(i<=right){
            
            ListNode temp=curr.next;
            curr.next=prev;
            prev=curr;
            curr=temp;
            i++;
        }
        
        node.next.next=curr;
        node.next=prev;
        
        return dummy.next;
        
        
    }
}