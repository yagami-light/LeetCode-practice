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
    public ListNode insertionSortList(ListNode head) {
        ListNode dummy=new ListNode();
        ListNode newHead=dummy;
        ListNode curr=head;
        int count=0;
        while(curr!=null){
            count++;
            curr=curr.next;
        }
      // System.out.println("count is :"+count);
        while(count>0){
                  // System.out.println("count is :"+count);

        ListNode minNode=new ListNode(Integer.MAX_VALUE);
        curr=head;
        ListNode prev=null;
        ListNode prevMinNode=null;
        while(curr!=null){
        // System.out.println("curr value  is :"+curr.val);

            if(curr.val<minNode.val){
                minNode=curr;
                prevMinNode=prev;
            }
            prev=curr;
            curr=curr.next;
            
            
        }
            if(prevMinNode!=null)
        prevMinNode.next=minNode.next;
        else if(minNode==head){
            head=head.next;
        }
        // System.out.println("min value :"+minNode.val);
        dummy.next=minNode;
        dummy=dummy.next;
        
        // curr=head;
        count--;
        }
        
        return newHead.next;
        
    }
}