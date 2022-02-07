class Solution {
    
    TrieNode root=new TrieNode();
    
    class TrieNode{
        TrieNode[] children=new TrieNode[26];
        String word;
    }
    
    public List<String> findWords(char[][] board, String[] words) {
        TrieNode node=root;
        List<String> result=new ArrayList();
        for(String word: words){
            
            insert(word,node);
            
        }
        
        for(int i=0;i<board.length;i++){
            
            for(int j=0;j<board[0].length;j++){
               
                    search(board,i,j,words[0],0,node,result);
            }
        }
        
        return result;
        
        
    }
    
    private void insert(String str,TrieNode root){
        int size=str.length();
        TrieNode node=root;
        
        for(int i=0;i<size;i++){
            
            int index=str.charAt(i)-'a';
            if(node.children[index]==null)
                node.children[index]=new TrieNode();
            
            node=node.children[index];
            
            
        }
        
        node.word=str;
    }
    
    private void search(char[][] board, int i,int j,String str,int index, TrieNode node,List<String> result){
        if(i<0 || j<0 || i>=board.length || j>= board[0].length)
            
            return;
        
        if( board[i][j]=='#' )
            return;
         char c=board[i][j];
         node=node.children[c-'a'];
        if(node==null)
            return;
        
        
        
        if(node!=null && node.word!=null){
            result.add(node.word);
            node.word=null;   
        }
       
        
        
       
        
            board[i][j]='#';
            search(board,i+1,j,str,index+1,node,result);
            search(board,i-1,j,str,index+1,node,result);
            search(board,i,j+1,str,index+1,node,result);
            search(board,i,j-1,str,index+1,node,result);
            board[i][j]=c;
            
        
        
        
       
    }
    
    
    
    
}