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
        if(head==null || head.next==null || k==0)
            return head;
        int len=0;
        ListNode dummy=new ListNode(-1);
        dummy.next=head;
        ListNode temp=dummy;
        while(temp.next!=null){
            len++;
            temp=temp.next;
        }
        // int i=0;
       
        
        System.out.println("lengtgh "+len);
        System.out.println("i length "+(len-k)%len);
        
        ListNode slow=dummy;
        for(int j=len-k%len;j>0;j--){
            slow=slow.next;
        }
        
        temp.next=dummy.next;
        dummy.next=slow.next;
        slow.next=null;
        
        
        return dummy.next;
        
    }
}