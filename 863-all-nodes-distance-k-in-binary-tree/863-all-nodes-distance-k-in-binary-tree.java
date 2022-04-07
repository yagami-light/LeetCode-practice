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
        System.out.println(map);
        System.out.println(target);
        List<Integer> res=new ArrayList();
        search(root,target,map,res,0,k);
        return res;
        
    }
    
    private void   search(TreeNode root,TreeNode target,Map<TreeNode,Integer> map, List<Integer> res,int length,int k)
    {
        if(root==null)
            return;
        if(map.containsKey(root))
            length=map.get(root);
        
        if(k==length)
            res.add(root.val);
        search(root.left,target,map,res,length+1,k);
        search(root.right,target,map,res,length+1,k);
        
    }
    
    
    private int find(TreeNode root,TreeNode target,Map<TreeNode,Integer> map){
        
        if(root==null)
            return -1;
        
        if(root==target){
            map.put(root,0);
            return 0;
        }
        
        int left=find(root.left,target,map);
         if(left>=0){
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
    
    
    
    
    
}