class Solution {
    public boolean wordBreak(String s, List<String> wordDict) {
     
        return wordBreakUtil(s,wordDict);
    }
    
    
    private boolean wordBreakUtil(String s, List<String> wordDict ){
        boolean[] checked=new boolean[s.length()+1];
        checked[0]=true;
        
        for(int i=1;i<=s.length();i++){
            
            for(int j=0;j<i;j++){
                
                
                String subString=s.substring(j,i);
                if(checked[j] && wordDict.contains(subString))
                {
                    checked[i]=true;
                }
                
                
            }
            
        }
        
        
        return checked[s.length()];
        
        
        
    }
}