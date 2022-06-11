class Solution {
    public boolean isMatch(String s, String p) {
                 Boolean[][] dp
=new Boolean[s.length()+1][p.length()+1];
        
        return isMatch(s,p,dp,0,0);

        
    }
    
    private boolean isMatch(String s,String p,Boolean[][] dp,int sStart,int pStart){
        
        
           if(p.isEmpty())
            return s.isEmpty();
        
        
        if(s.isEmpty())
            return p.isEmpty() | isStarPattern(p);
        String key=s+"@"+p;
        
        if(dp[sStart][pStart]!=null)
            return dp[sStart][pStart];
        
        boolean firstMatch=s.charAt(0)==p.charAt(0) || p.charAt(0)=='?';
        if(p.charAt(0)=='*'){
            boolean res=  isMatch(s,p.substring(1),dp,sStart,pStart+1) || isMatch(s.substring(1),p,dp,sStart+1,pStart);
            dp[sStart][pStart]=res;
            return res;
        }else
        { 
            boolean res=firstMatch && isMatch(s.substring(1),p.substring(1),dp,sStart+1,pStart+1);
            dp[sStart][pStart]=res;
            return res;
        
         
        }
        
        
        
        
        
        
    }
    
    
    private boolean isStarPattern(String p){
        for(int i=0;i<p.length();i++){
            if(p.charAt(i)!='*')
                return false;
        }
        return true;
    }
    
}