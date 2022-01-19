class Solution {
    
    TrieNode root=new TrieNode();
    String result="";
    
    class TrieNode{
        
        TrieNode children[];
        String  word;
        
        public TrieNode(){
            children=new TrieNode[26];
            
        }
        
    }
    
    private void insert(String word){
        
        TrieNode node=root;
        int length=word.length();
        for(int level=0;level<length;level++){
            
            int index=word.charAt(level)-'a';
            if(node.children[index]==null){
                node.children[index]=new TrieNode();
            }
            node=node.children[index];
            
            
        }
        
        node.word=word;
        
        
        
        
    }
    
    
    private void dfs(TrieNode node){
        if(node == null)
            return;
        
        if(node.word!=null){
            if(result.length()<node.word.length()){
                result=node.word;
                
            }
            else if(node.word.length()==result.length() && node.word.compareTo(result)<0){
                result=node.word;
                
                
            }
        }
        
        
        for(TrieNode child: node.children){
            if(child!=null && child.word!=null)
            dfs(child);
        }
        
        
        
    }
    
    
    
    public String longestWord(String[] words) {
        
        for(String word:words){
            
            insert(word);
        }
        
        dfs(root);
        
        return result;
        
        
        
        
    }
}