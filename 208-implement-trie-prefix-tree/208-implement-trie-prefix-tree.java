class Trie {

    TrieNode roott;
    
    class TrieNode{
        
        TrieNode[] children=new TrieNode[26];
        boolean isEnd;
        
        
    }
    
    
    public Trie() {
        
        roott=new TrieNode();
        
        
    }
    
    public void insert(String word) {
        int len=word.length();
        TrieNode root=roott;
        for(int level=0;level<len;level++){
            
            int index=word.charAt(level)-'a';
            if(root.children[index]==null){
                
                root.children[index]=new TrieNode();
                
            }
            
            root=root.children[index];
            
            
            
            
        }
        
        root.isEnd=true;
        
        
    }
    
    public boolean search(String word) {
        int len=word.length();
          TrieNode root=roott;
        for(int level=0;level<len;level++){
            
            int index=word.charAt(level)-'a';
            if(root.children[index]!=null){
                root=root.children[index];
                
            }else
                return false;
            
        }
        
        
        return root.isEnd;
        
        
    }
    
    public boolean startsWith(String prefix) {
        int len=prefix.length();
        TrieNode root=roott;
        for(int level=0;level<len;level++){
            int index=prefix.charAt(level)-'a';
            if(root.children[index]==null)
                return false;
            else
                root=root.children[index];
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