/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class Codec {

    
    
    // Encodes a tree to a single string.
    public String serialize(TreeNode root) {
        StringBuilder serializedResult=new StringBuilder();

        if(root==null){
            
            serializedResult.append("#"+",");
        
            
        }else{
            
            serializedResult.append(root.val+",");
            
           serializedResult.append(serialize(root.left));
            serializedResult.append(serialize(root.right));
            
            
            
        }
        
        
       return  new String(serializedResult);
        
    }

    // Decodes your encoded data to tree.
    public TreeNode deserialize(String data) {
        Deque<String> deque=new LinkedList(new ArrayList(Arrays.asList(data.split(","))));
        TreeNode root=buildNode(deque);
        
        return root;
        
        
    
    }
    
    private TreeNode buildNode(Deque<String> deque){
        String val=deque.remove();
        if(val.equals("#"))
            return null;
        else{
            
            TreeNode root=new TreeNode(Integer.parseInt(val));
            root.left=buildNode(deque);
            root.right=buildNode(deque);
            
              return root;
            
        }
        
      
        
    }
    
    
}

// Your Codec object will be instantiated and called as such:
// Codec ser = new Codec();
// Codec deser = new Codec();
// TreeNode ans = deser.deserialize(ser.serialize(root));