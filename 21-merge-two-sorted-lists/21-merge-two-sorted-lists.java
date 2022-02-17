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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        if(list1==null)
            return list2;
        if(list2==null)
            return list1;
        
        
        ListNode dummyNode=new ListNode();
        ListNode newHead=dummyNode;
        if(list1.val < list2.val){
            ListNode newNode=new ListNode(list1.val);
            dummyNode.next=newNode;
            dummyNode=dummyNode.next;
            dummyNode.next=mergeTwoLists(list1.next,list2);
        }else{
             ListNode newNode=new ListNode(list2.val);
            dummyNode.next=newNode;
            dummyNode=dummyNode.next;
             dummyNode.next=mergeTwoLists(list2.next,list1);
        }
        
        return newHead.next;
        
        
    }
}