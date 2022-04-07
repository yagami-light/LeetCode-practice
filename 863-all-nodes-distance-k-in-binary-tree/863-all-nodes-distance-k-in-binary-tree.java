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
        Map<TreeNode,TreeNode> parentMap=new HashMap();
        
        parentMap(root,parentMap);
        System.out.println(parentMap);
        
        Queue<TreeNode> queue=new LinkedList();
        queue.add(target);
        int count=0;
        Set<TreeNode> set=new HashSet();
        List<Integer> res=new ArrayList();
        
        while(!queue.isEmpty()){
            int size=queue.size();
            count++;
            for(int i=0;i<size;i++){
                
                TreeNode node=queue.remove();
                
              if(set.contains(node)) {
                  
                  System.out.println("continue");     
                  continue;
              }
                if(count-1==k){
                    res.add(node.val);
                }
                    set.add(node);

                
                  if(parentMap.get(node)!=null && !set.contains(parentMap.get(node)))
                    queue.add(parentMap.get(node));
                if(node.left!=null && !set.contains(node.left))
                    queue.add(node.left);
                
                if(node.right!=null && !set.contains(node.right))
                    queue.add(node.right);
                    
                
                
                
            }
            
            if(k==count-1)
                return res;
            
        }
        
        return res;
            
        
        
    }
    
    private void parentMap2(TreeNode root,Map<TreeNode,TreeNode> parentMap){
        if(root==null)
            return;
        
        if(root.left!=null)
            parentMap.put(root.left,root);
        
        if(root.right!=null)
            parentMap.put(root.right,root);
        
        parentMap(root.left,parentMap);
        parentMap(root.right,parentMap);
        
        
        
    }
    
    
      private void parentMap(TreeNode root,Map<TreeNode,TreeNode> map){
            if(root==null)
                return;

            if(root.left!=null){
                map.put(root.left,root);
                parentMap(root.left,map);

        }

            if(root.right!=null){
                map.put(root.right,root);
                parentMap(root.right,map);

        }


        }

    
    
    
}
