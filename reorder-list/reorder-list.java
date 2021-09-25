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
    public void reorderList(ListNode head) {
        
         reOrderListUtil(head);
    }
    
    private ListNode reOrderListUtil(ListNode head){
        if(head==null || head.next==null || (head!=null && head.next!=null && head.next.next==null))
            return head;
        // System.out.println("value "+head.val);
        ListNode prev=null;
        ListNode headNextNode=head.next;
        ListNode temp=head;
        while(temp.next!=null){
            prev=temp; 
            temp=temp.next;
                  
        }
        
        head.next=temp;
        // System.out.println("prev value"+prev.val);
        // System.out.println("temp value"+temp.val);

        prev.next=null;
        // System.out.println("headNextNode value "+headNextNode.val);
        temp.next=reOrderListUtil(headNextNode);
        
        return head;    
        
        
    }
    
}