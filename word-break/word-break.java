class Solution {
    public boolean wordBreak(String s, List<String> wordDict) {
        
        return wordBreakUtil(s,wordDict);
    }
    
    
    private boolean wordBreakUtil(String s, List<String> list ){
        boolean[] check=new boolean[s.length()+1];
        check[0]=true;
        for(int i=1;i<=s.length();i++){
            
            
            for(int j=0;j<i;j++){
                
                String subString=s.substring(j,i);
                System.out.println("subString "+subString);
                if(check[j] && list.contains(subString)){
                    System.out.println("check found at index "+i+" for subString "+subString);
                    check[i]=true;
                    
                }
                
                
            }
            
        }
        
        
        return check[s.length()];
        
        
    }
    
    
}