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
    class Node{
        double value;
        double count;
        
        Node(double value, double count){
            this.value=value;
            this.count=count;
        }
        
    }
    public List<Double> averageOfLevels(TreeNode root) {
        List<Node> list=new ArrayList();
        List<Double> res=new ArrayList();
        
        dfs(root,0,list);
        System.out.println("size "+list.size());
        res=list.stream().map(node-> (node.value/node.count)).collect(Collectors.toList());
        
        return res;
    }
    
    private void dfs(TreeNode root,int level,List<Node> listOfNode){
        if(root==null)
            return;
        if(listOfNode.size() <=level){
            listOfNode.add(new Node(root.val,1));
        }else
        {
            listOfNode.get(level).value+=root.val;
            // listOfNode.get(level).value+=root.val;
            listOfNode.get(level).count++;

            
            
        }
        
        dfs(root.left,level+1,listOfNode);
        dfs(root.right,level+1,listOfNode);
        
    }
    
    
}