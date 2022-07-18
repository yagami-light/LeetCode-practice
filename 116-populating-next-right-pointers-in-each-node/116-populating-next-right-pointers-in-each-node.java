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
    Node prev=null;
    public Node connect(Node root) {
        List<List<Node>> res=new ArrayList();
        
        helper(root,0,res);
        return root;
    }
    
    private void helper(Node root,int height, List<List<Node>> res){
        if(root==null)
         return;
        
        
        if(height>=res.size())
            res.add(new ArrayList());
        List<Node> list=res.get(height);
        if(list.size()>0)
        root.next=list.get(list.size()-1);
        res.get(height).add(root);
        
        helper(root.right,height+1,res);
        helper(root.left,height+1,res);
        
        
    }
    
}