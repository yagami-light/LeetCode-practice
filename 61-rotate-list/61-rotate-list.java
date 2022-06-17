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
    public ListNode rotateRight(ListNode head, int k) {
        int count=1;
        ListNode temp=head;
        while(temp!=null && temp.next!=null){
            temp=temp.next;
            count++;
        }
        System.out.println("count : "+count);
        k=k % count;
        for(int i=0;i<k;i++){
         head=rotateRightBy1(head);   
        }
        
        return head;
    }
    
    public ListNode rotateRightBy1(ListNode head){
        if(head==null || head.next==null){
            return head;
        }
        
        ListNode nextToHead=head.next;
        ListNode prev=null;
        ListNode temp=head;
        while(temp.next!=null){
            prev=temp;
            temp=temp.next;
        }
        
        temp.next=head;
        prev.next=null;
        return temp;
        
    }
    
}