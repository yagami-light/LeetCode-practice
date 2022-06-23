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
    public ListNode deleteDuplicates(ListNode head) {
        
        return deleteDuplicatesUtil(head);
    }
    
    private ListNode deleteDuplicatesUtil(ListNode head){
        if(head==null || head.next==null)
            return head;
        
        ListNode HeadToNExt=head.next;
        HeadToNExt=deleteDuplicatesUtil(HeadToNExt);
        if(HeadToNExt.val==head.val){
            return HeadToNExt;
        }else{
            head.next=HeadToNExt;
            return head;
        }
    }
    
    
}