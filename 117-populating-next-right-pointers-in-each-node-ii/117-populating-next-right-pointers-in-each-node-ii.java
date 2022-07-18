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
        List<List<Node>> res=new ArrayList();
        int height=0;
        helper(root,height,res);
        return root;
        
    }
    
    private void helper(Node root, int height,List<List<Node>> res){
        if(root==null) return;
        
        if(height >= res.size()){
            res.add(new ArrayList());
        }
        
        if(!res.get(height).isEmpty()){
            List<Node> list=res.get(height);
            list.get(list.size()-1).next=root;
            // res.get(height).get().next=root;
        }
        res.get(height).add(root);
        
        helper(root.left,height+1,res);
        helper(root.right,height+1,res);
    }
    
}