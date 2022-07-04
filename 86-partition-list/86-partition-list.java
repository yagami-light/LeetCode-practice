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
    public ListNode partition(ListNode head, int x) {
        
        ListNode dummy=new ListNode(-1);
        ListNode delemiter1=dummy;
        
        ListNode temp=head;
        ListNode dummy2=new ListNode(-1);
        ListNode delemiter=dummy2;
        while(temp!=null){
            System.out.println("val is :"+temp.val);
            if(temp.val<x){
                System.out.println("alex val is :"+temp.val);

                dummy.next=temp;
                dummy=dummy.next;
            }else{
                dummy2.next=temp;
                dummy2=dummy2.next;
            }
            temp=temp.next;
            
            
        }
        
        dummy2.next=null;
        
        dummy.next=delemiter.next;
        return delemiter1.next;
        
    }
}