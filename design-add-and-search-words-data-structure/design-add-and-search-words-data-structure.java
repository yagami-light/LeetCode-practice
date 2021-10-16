class WordDictionary {
    TrieNode root;
    
    class TrieNode{
        TrieNode[] children=new TrieNode[26];
        boolean isWord=false;
                
    }

    public WordDictionary() {
        root=new TrieNode();
        
    }
    
    public void addWord(String word) {
        int n=word.length();
        TrieNode node=root;
        for(int i=0;i<n;i++){
            int index=word.charAt(i)-'a';
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
    
    
    private boolean searchUtil(char[] wordArray,TrieNode node, int index){
        if(index==wordArray.length)
            return node.isWord;
        else{
            char c=wordArray[index];
            if(c!='.' &&  node!=null){
               
                return node.children[c-'a']!=null && searchUtil(wordArray,node.children[c-'a'],index+1);
               
            }else{
                for(int k=0;k<26;k++){
                    if(node.children[k]!=null && searchUtil(wordArray,node.children[k],index+1))
                        return true;
                }
                return false;
            }
        }
    }
    
    
    
    
    
}

/**
 * Your WordDictionary object will be instantiated and called as such:
 * WordDictionary obj = new WordDictionary();
 * obj.addWord(word);
 * boolean param_2 = obj.search(word);
 */