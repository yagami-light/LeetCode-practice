class Trie {
    
    TrieNode root;

    class TrieNode{
        
        TrieNode[] children=new TrieNode[256];
        boolean isWord;
        
        
    }
    
    
    public Trie() {
        
        root=new TrieNode();
        
    }
    
    public void insert(String word) {
        int length=word.length();
        TrieNode node=root;
        
        for(int level=0;level<word.length();level++){
            
            int index=word.charAt(level)-'a';
            if(node.children[index]==null){
                
                node.children[index]=new TrieNode();
                
            }
            node=node.children[index];
            
            
            
        }
        
        node.isWord=true;
        
        
        
    }
    
    public boolean search(String word) {
          TrieNode node=root;
        
        for(int level=0;level<word.length();level++){
            
            int index=word.charAt(level)-'a';
            if(node.children[index]==null){
                
            return false;
                
            }
            node=node.children[index];
            
            
            
        }
        return node.isWord;
    }
    
    public boolean startsWith(String word) {
          TrieNode node=root;
        
        for(int level=0;level<word.length();level++){
            
            int index=word.charAt(level)-'a';
            if(node.children[index]==null){
                
            return false;
                
            }
            node=node.children[index];
            
            
            
        }
        return true;
        
        
    }
}

/**
 * Your Trie object will be instantiated and called as such:
 * Trie obj = new Trie();
 * obj.insert(word);
 * boolean param_2 = obj.search(word);
 * boolean param_3 = obj.startsWith(prefix);
 */