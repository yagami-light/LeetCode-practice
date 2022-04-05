/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    public List<Integer> distanceK(TreeNode root, TreeNode target, int k) {
        Map<TreeNode,Integer> map=new HashMap();
        find(root,target,map);
        // System.out.println(map);
                // System.out.println(root);

        List<Integer> res=new LinkedList();
        search(root,target,k,map.get(root),map,res);
        return res;
        
    }
    
    
    private int find(TreeNode root,TreeNode target,Map<TreeNode,Integer> map){
        if(root==null)
            return -1;
        
        if(target==root){
            map.put(root,0);
            return 0;
        }
        
        
        int left=find(root.left,target,map);
        if(left >=0 ){
            map.put(root,left+1);
            return left+1;
        }
        int right=find(root.right,target,map);
        if(right>=0){
            map.put(root,right+1);
            return right+1;
        }
        
        
        
        return -1;
    }
    
    
    private void search(TreeNode root, TreeNode target, int k , int length,Map<TreeNode,Integer> map, List<Integer> res){
        if(root==null)
            return;
        if(map.containsKey(root))
            length=map.get(root);
        
        if(length==k)
            res.add(root.val);
        
        
        
        
        search(root.left,target,k,length+1,map,res);
        search(root.right,target,k,length+1,map,res);
    }
    
    
}