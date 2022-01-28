class Solution {
    public boolean isSubsequence(String s, String t) {
        
        
        return isSubUtil(s,t,0,0);
        
        
    }
    
    private boolean isSubUtil(String s,String t, int i,int j){
        System.out.println("index i "+i + " index j"+j);
        if(i<=s.length()-1 && j>=t.length())
            return false;
        
        if(i>=s.length())
            return true;
        
        
            
            
            if(i<s.length() && j<t.length() && s.charAt(i) == t.charAt(j))
                return isSubUtil(s,t,i+1,j+1);
            else
                return isSubUtil(s,t,i,j+1);
            
            
            
        
        
    }
    
    
    
}