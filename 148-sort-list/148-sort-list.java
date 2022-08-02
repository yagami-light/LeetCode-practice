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
        List<Integer> list=new ArrayList();
        ListNode curr=head;
        while(curr!=null){
            list.add(curr.val);
            curr=curr.next;
        }
        ListNode dummy=new ListNode();
        ListNode newHead=dummy;
        Collections.sort(list);
        // System.out.println("liset :"+list);
        for(int i=0;i<list.size();i++){
            System.out.println("list :"+list.get(i));
            dummy.next=new ListNode(list.get(i));
            dummy=dummy.next;
        }
        
        
        return newHead.next;
        
    }
}