class Solution {
    public List<String> wordBreak(String s, List<String> wordDict) {
        
       return dfs(s,new HashSet(wordDict));
        
    }
    
    private List<String> dfs(String s,Set<String> wordDict){
        
        LinkedList<String> res=new LinkedList();
        if(s.length()==0){
            res.add("");
            return res;
        }
        
        for(String word:wordDict){
            if(s.startsWith(word)){
                List<String> subList=dfs(s.substring(word.length()),wordDict);
                for(String str:subList){
                    res.add(word+(str.isEmpty()?"":" ")+str);
                }
            }
        }
        
        return res;
        
        
    }
    
}