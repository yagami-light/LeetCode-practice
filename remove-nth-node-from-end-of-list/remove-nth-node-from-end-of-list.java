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
        ListNode normal=temp;
        
        
        int count=0;
        while(fast!=null && count<n){
            
            fast=fast.next;
            count++;
            
        }
        
        fast=fast.next;
        while(fast!=null){
            fast=fast.next;
            normal=normal.next;
        }
        System.out.println("normal value "+normal.val);
        
        normal.next=normal.next.next;
        
        
        return temp.next;
        
        
        
    }
}