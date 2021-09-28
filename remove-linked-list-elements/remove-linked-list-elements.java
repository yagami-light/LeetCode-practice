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
        
        return removeElementUtil(head,val);
    }
    
    
    
    private ListNode removeElementUtil(ListNode head, int val){
        if(head==null )
            return head;
        
         if(head!=null && head.val==val)
             return removeElementUtil(head.next,val);
        
        
     //   ListNode head=head;
        ListNode nextSubList=removeElementUtil(head.next,val);
        
        head.next=nextSubList;
        
        return head;
        
        
    }
}