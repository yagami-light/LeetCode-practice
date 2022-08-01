/*
// Definition for a Node.
class Node {
    int val;
    Node next;
    Node random;

    public Node(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }
}
*/

class Solution {
    public Node copyRandomList(Node head) {
        Map<Node,Node> map=new HashMap();
        
        Node curr=head;
        Node dummy=new Node(-1);
        
        while(curr!=null){
            
            Node copyNode=new Node(curr.val);
            System.out.println("currNode val:"+curr.val+" copy Node val:"+copyNode.val);
            dummy.next=copyNode;
            map.put(curr,copyNode);
            curr=curr.next;
            dummy=dummy.next;
            
        }
        
        
        Node newHead=map.get(head);
        Node copyCurr=newHead;
         curr=head;
        while(curr!=null){
            
            Node nextRandom=curr.random;
            copyCurr.random=map.get(nextRandom);
            
            curr=curr.next;
            copyCurr=copyCurr.next;
            
        }
        
        return newHead;
        
        
        
    }
}