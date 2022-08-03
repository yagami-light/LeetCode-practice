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
    public ListNode sortList(ListNode head) {
        if(head==null || head.next==null) return head;
        ListNode fast=head;
        ListNode slow=head;
        ListNode prev=null;
        while(fast!=null && fast.next!=null){
            prev=slow;
            fast=fast.next.next;
            slow=slow.next;
        }
        prev.next=null;
        ListNode list1=head;
        ListNode list2=slow;
        // System.out.println("slow value :"+slow.val);
        
        // printList(list1);
        // printList(list2);
        return merge(sortList(list1),sortList(list2));
        
        
    }
    
    private void printList(ListNode head){
        System.out.println("printing...");
        while(head!=null){
            System.out.println("print : "+head.val);
            head=head.next;
        }
    }
    
    
    private ListNode merge(ListNode list1,ListNode list2){
        // if(list1==null && list2==null) return list1;
        if(list1==null) return list2;
        if(list2==null) return list1;
        ListNode dummy=new ListNode();
        if(list1.val<=list2.val){
            ListNode res=new ListNode(list1.val);
            res.next=merge(list1.next,list2);
            dummy.next=res;
            // return res;
        }else{
            
           ListNode res=new ListNode(list2.val);
            res.next=merge(list1,list2.next);
             dummy.next=res;
            // return res;
            
            
        }
        
        return dummy.next;
    }
    
}