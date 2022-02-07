class WordDictionary {
    TrieNode root;
    
    class TrieNode{
        TrieNode[] children=new TrieNode[256];
        boolean isWord;
        
    }
    

    public WordDictionary() {
        root=new TrieNode();
        
    }
    
    public void addWord(String word) {
        int size=word.length();
        TrieNode node=root;
        
        for(int level=0;level<size;level++){
            
            int index=word.charAt(level)-'a';
            
            if(node.children[index]==null)
                node.children[index]=new TrieNode();
            
            node=node.children[index];
            
            
            
        }
        
        node.isWord=true;
        
    }
    
    public boolean search(String word) {
        
        return search(word,0,root);
        
        
        
    }
    
    private boolean search(String word,int index,TrieNode node){
        if(node==null)
            return false;
        if(index>=word.length())
            return node!= null && node.isWord;
        
        
        char currChar=word.charAt(index);
        if(currChar != '.')
            return node!= null && node.children[currChar-'a']!=null && search(word,index+1,node.children[currChar-'a']);
        else{
            for(int i=0;i<26;i++){
                

                if(search(word,index+1,node.children[i]))
                    return true;
                
                
            }
            return false;
            
        }
        
                
            
            
        
        
    }
    
    
    
}

/**
 * Your WordDictionary object will be instantiated and called as such:
 * WordDictionary obj = new WordDictionary();
 * obj.addWord(word);
 * boolean param_2 = obj.search(word);
 */