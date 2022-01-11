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
        StringBuilder str=new StringBuilder();
        if(root==null)
            str.append("#,");
        else{
        str.append(root.val+",");
        str.append(serialize(root.left));
        str.append(serialize(root.right));
        }
        return str.toString();
        
    }

    // Decodes your encoded data to tree.
    public TreeNode deserialize(String data) {
        String[] valArray=data.split(","); 
        
        Queue<String> queue=new LinkedList(Arrays.asList(valArray));
        // queue.addAll();
        
        return buildNode(queue);
        
        
    }
    
    private TreeNode buildNode(Queue<String> queue){
        String str=queue.remove();
        if(str.equals("#"))
            return null;
        
       TreeNode newNode=new TreeNode(Integer.parseInt(str));
        newNode.left=(buildNode(queue));
        newNode.right=(buildNode(queue));
        return newNode;
        
        
    }
    
    
}

// Your Codec object will be instantiated and called as such:
// Codec ser = new Codec();
// Codec deser = new Codec();
// TreeNode ans = deser.deserialize(ser.serialize(root));