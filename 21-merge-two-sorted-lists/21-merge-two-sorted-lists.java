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
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        
        return mergeTwoListsUtil(l1,l2);
    }
    
    private ListNode mergeTwoListsUtil(ListNode l1,ListNode l2){
        if(l1==null && l2==null)
            return null;
        
        if(l1==null && l2!=null)
            return l2;
        
        if(l1!=null && l2==null)
            return l1;
        
        
        if(l1.val<l2.val)
        {
            ListNode node=new ListNode(l1.val);
            node.next=mergeTwoListsUtil(l1.next,l2);
            return node;
            
            
        }
        else{
            
             ListNode node=new ListNode(l2.val);
            node.next=mergeTwoListsUtil(l1,l2.next);
            return node;
            
            
        }
        
        
    }
    
}