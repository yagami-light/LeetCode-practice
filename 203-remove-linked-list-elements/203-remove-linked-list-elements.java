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
        ListNode tail=new ListNode();
        tail.next=head;
        ListNode newHead=tail;
        ListNode curr=head;
        while(curr!=null){
            while(curr!=null && curr.val==val){
                
                curr=curr.next;
            }
            tail.next=curr;
            if(curr!=null)
            curr=curr.next;
            tail=tail.next;
        }
        
        return newHead.next;
        
    }
}