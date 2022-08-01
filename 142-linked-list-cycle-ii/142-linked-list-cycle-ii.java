/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode detectCycle(ListNode head) {
        ListNode slow=head;
        ListNode fast=head;
        ListNode normal=head;
        
        while(slow!=null){
            slow=slow.next;
            if(fast!=null && fast.next!=null){
                fast=fast.next.next;
            }else
                return null;
            if(fast==slow){
                while(normal!=slow){
                    
                    normal=normal.next;
                    slow=slow.next;
                    
                }
                
                
                return normal;
            }
            
            
            
        }
        
        return null;
        
        
    }
}