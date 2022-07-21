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
        Node curr=head;
        Node cloneCurr=new Node(-1);
        Node cloneHead=cloneCurr;
        Map<Node,Node> map=new HashMap();
        while(curr!=null){
            
            Node newNode=new Node(curr.val);
            map.put(curr,newNode);

            curr=curr.next;
            cloneCurr.next=newNode;
            cloneCurr=cloneCurr.next;
            
        }
        
          curr=head;
         cloneCurr=cloneHead.next;
       while(curr!=null){
            
            // Node newNode=new Node(curr.val);
           // System.out.println("curr value : "+curr.val+" cloneCurr  value :"+cloneCurr.val);
            Node targetNode=curr.random;
           if(targetNode==null)
           {
               cloneCurr.random=null;
           }else{
            Node clonedOfTargeNode=map.get(targetNode);
            // System.out.println("target value : "+targetNode +" target cloneCurr  value :"+clonedOfTargeNode);

            cloneCurr.random=clonedOfTargeNode;
           }
            curr=curr.next;
            
            cloneCurr=cloneCurr.next;
            // map.put(curr,newNode);
            
        }
        
        return cloneHead.next;
        
    }
}