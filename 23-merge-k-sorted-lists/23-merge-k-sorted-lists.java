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
    public ListNode mergeKLists(ListNode[] lists) {
        
        
        ListNode result=new ListNode(Integer.MIN_VALUE);
      
        for(ListNode node:lists){
            
            result=merge2List(result,node);
            
            
        }
        
        
        return result.next;
        
        
        
        
    }
    
    private ListNode merge2List(ListNode n1,ListNode n2){
           ListNode newHead=new ListNode();
            ListNode dummy=newHead;
        if(n1==null && n2==null)
            return  null;
        
        else if(n1==null && n2!=null)
            return n2;
        else if(n2==null && n1!=null)
            return n1;
        else{
            
         
            
            if(n1.val <n2.val){
                
                dummy.next=n1;
                dummy=n1;
                dummy.next=merge2List(n1.next,n2);
                
                
            }else{
                
                dummy.next=n2;
                dummy=n2;
                dummy.next=merge2List(n1,n2.next);
                
                
            }
            
            
            
            
        }
        
        return newHead.next;
        
        
    }
    
    
}