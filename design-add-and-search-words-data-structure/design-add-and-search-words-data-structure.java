class WordDictionary {
    TrieNode root;
    class TrieNode{
        TrieNode[] children=new TrieNode[26];
        boolean isWord;
        
    }

    public WordDictionary() {
        root=new TrieNode();
    }
    
    public void addWord(String word) {
        int n=word.length();
        TrieNode node=root;
        
        for(int level=0;level<n;level++){
            int index=word.charAt(level)-'a';
            if(node.children[index]==null)
                node.children[index]=new TrieNode();
            node=node.children[index];
        }
        node.isWord=true;        
        
    }
    
    public boolean search(String word) {
       TrieNode node=root;
        
        return searchUtil(word.toCharArray(),node,0);
        
        
    }
        
  
    private boolean searchUtil(char[] word,TrieNode root,int index){
        if(index==word.length)
            return root.isWord;
        
       
        else{
            char c=word[index];
            if(c!='.' && root!=null){
                 return root.children[c-'a']!=null && (searchUtil(word,root.children[c-'a'],index+1));
                     // return true;
                
                
            }else{
                
                for(int i=0;i<root.children.length;i++){
                    
                    if(root.children[i]!=null && (searchUtil(word,root.children[i],index+1)))
                        return true;
                    
                }
                
                return false;
                
            }
            
            
        }
        
         // return false;
    }
}

/**
 * Your WordDictionary object will be instantiated and called as such:
 * WordDictionary obj = new WordDictionary();
 * obj.addWord(word);
 * boolean param_2 = obj.search(word);
 */