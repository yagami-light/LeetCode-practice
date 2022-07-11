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
        
        Stack<TreeNode> stack=new Stack();
        TreeNode curr=root;
        boolean flag=true;
        TreeNode prev=null;
        TreeNode fistVio=null,fistVioNext=null,secondVio=null;
        while(curr!=null || !stack.isEmpty()){
            
            
            while(curr!=null){
                stack.add(curr);
                curr=curr.left;
            }
            
            curr=stack.pop();
            if(prev!=null && prev.val > curr.val ){
                if(flag){
                fistVio=prev;
                fistVioNext=curr;
                flag=!flag;
                }else{
                    secondVio=curr;
                }
            }
            prev=curr;
            curr=curr.right;
            
        }
        
        if(secondVio!=null){
        int temp=fistVio.val;
        fistVio.val=secondVio.val;
        secondVio.val=temp;
        }
        else{
            
        int temp=fistVio.val;
        fistVio.val=fistVioNext.val;
        fistVioNext.val=temp;
        }  
            
            
            
        }
        
        
    
}