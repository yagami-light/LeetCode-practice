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
        if(root==null){
            str.append("#"+",");
        }
        
        else{
        str.append(root.val+",");
        str.append(serialize(root.left));
        str.append(serialize(root.right));
        }
        
        return str.toString();
        
        
        
        
    }

    // Decodes your encoded data to tree.
    public TreeNode deserialize(String data) {
        System.out.println("data is "+data);
        String[] nodeValues=data.split(",");
        Queue<String> queue=new LinkedList((Arrays.asList(nodeValues)));
        
        return buildNode(nodeValues,queue);
        
        // return null;
    }
    
    
    private TreeNode buildNode(String[] nodeValues,Queue<String> queue){
        String rootValue=queue.remove();
        if(rootValue.equals("#"))
            return null;
        
        TreeNode root=new TreeNode(Integer.parseInt(rootValue));
        root.left=buildNode(nodeValues,queue);
        root.right=buildNode(nodeValues,queue);
        
        return root;
        
        
        
    }
    
    
}

// Your Codec object will be instantiated and called as such:
// Codec ser = new Codec();
// Codec deser = new Codec();
// TreeNode ans = deser.deserialize(ser.serialize(root));