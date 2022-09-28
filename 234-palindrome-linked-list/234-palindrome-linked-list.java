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
    public boolean isPalindrome(ListNode head) {
        Stack<ListNode> stack=new Stack();
        ListNode curr=head;
        while(curr!=null){
            
            stack.push(curr);
            curr=curr.next;
            
            
            
        }
        
        curr=head;
        while(curr!=null){
            if(curr.val!=stack.peek().val) return false;
            stack.pop();
            curr=curr.next;
            
            
        }
        return stack.isEmpty();
        
        
    }
}