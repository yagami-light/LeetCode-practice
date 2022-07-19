/*
// Definition for a Node.
class Node {
    public int val;
    public Node left;
    public Node right;
    public Node next;

    public Node() {}
    
    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, Node _left, Node _right, Node _next) {
        val = _val;
        left = _left;
        right = _right;
        next = _next;
    }
};
*/

class Solution {
    public Node connect(Node root) {
        
       return helper(root);
    }
    
    private Node helper(Node root){
        
        if(root==null)
         return root;
        
        // System.out.println(:root value )
        if(root.left!=null){

            if(root.right!=null)
                root.left.next=root.right;
            else
                root.left.next=getNextValidNode(root);
            
        }
            
           
            
        if(root.right!=null)
            root.right.next=getNextValidNode(root);
            

        helper(root.right);
                    helper(root.left);

        return root;
        
        
    }
    
    
    private Node getNextValidNode2(Node root){
        System.out.println("alex");
        
        while(root!=null){
                        root=root.next;

            // System.out.println("root value "+root.val);
                        if(root.left!=null) return root.left;
            
            if(root.right!=null) return root.right;

        }
        System.out.println("alex 2");
        
        return null;
        
    }
    
     private Node getNextValidNode(Node root){
        if(root==null)
            return null;
        
        while(root.next!=null){
            root=root.next;
            if(root.left!=null)
                return root.left;
            if(root.right!=null)
                return root.right;
        }
        
        
        return null;
        
        
    }
    
    
    
    
}