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
            int count=0;
            List<Integer> res=new LinkedList();
            getParent(root,parentMap);
            Queue<TreeNode> queue=new LinkedList();
            queue.add(target);
            Set<TreeNode> set=new HashSet();
            while(!queue.isEmpty()){

                int size=queue.size();
                count++;

                for(int i=0;i<size;i++){

                    TreeNode node=queue.remove();
                    if(set.contains(node)){
                        System.out.println("it is there ");
                        continue;
                    }
                    set.add(node);

                    if(count-1==k){
                        res.add(node.val);
                    }
                    
                    if( node.left!=null &&  !set.contains(node.left))
                        queue.add(node.left);
                    if( node.right!=null && !set.contains(node.right))
                        queue.add(node.right);

                    if(parentMap.get(node)!=null && !set.contains(parentMap.get(node))){
                        queue.add(parentMap.get(node));
                        // System.out.println("parent adding for "+node.val);   
                        
                    }

                }


            }

            return res;




        }

        private void getParent(TreeNode root,Map<TreeNode,TreeNode> map){
            if(root==null)
                return;

            if(root.left!=null){
                map.put(root.left,root);
                getParent(root.left,map);

        }

            if(root.right!=null){
                map.put(root.right,root);
                getParent(root.right,map);

        }


        }




    }