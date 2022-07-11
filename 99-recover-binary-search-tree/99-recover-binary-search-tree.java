/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public void recoverTree(TreeNode root) {
        if(root==null) return;
        
        Stack<TreeNode> stack=new Stack();
        TreeNode curr=root;
        List<TreeNode> res=new ArrayList();
        List<Integer> integerList=new ArrayList();
        while(curr!=null || !stack.isEmpty()){
            
            
            while(curr!=null){
                
                stack.add(curr);
                curr=curr.left;
                
                
            }
            
            curr=stack.pop();
            res.add(curr);
            integerList.add(curr.val);
            curr=curr.right;
            
            
        }
        
        System.out.println("list print :"+integerList);
        System.out.println("Node list : "+res);
        Collections.sort(integerList);
        int count=0;
        for(int i:integerList){
            res.get(count++).val=i;
        }
        /*
        
        1,3,2,4
        
        */
        
        
    }
}