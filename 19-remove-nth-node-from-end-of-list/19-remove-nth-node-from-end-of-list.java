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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        
        ListNode temp=new ListNode();
        temp.next=head;
        ListNode fast=temp;
        ListNode slow=temp;
        int count=0;
        while(count<n ){
            
            fast=fast.next;
            count++;
            
        }
        
        fast=fast.next;
        
        while(fast!=null){
            fast=fast.next;
            slow=slow.next;
        }
        
        slow.next=slow.next.next;
        
        return temp.next;
        
        
    }
}