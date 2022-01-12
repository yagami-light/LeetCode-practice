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
    public boolean hasCycle(ListNode head) {
        
        if(head==null)
            return false;
        
        if(head.next == null)
            return false;
        
        ListNode fastPtr=head;
        ListNode normalPtr=head;
        
        while(fastPtr !=null && fastPtr.next !=null){
            
            fastPtr=fastPtr.next.next;
            normalPtr=normalPtr.next;
            
            if(normalPtr==fastPtr)
                return true;
            
            
        }
        
        return false;
        
    }
}