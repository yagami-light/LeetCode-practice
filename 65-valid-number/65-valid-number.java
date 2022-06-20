class Solution {
    public boolean isNumber(String s) {
        boolean dotSeen=false,digitSeen=false,eSeen=false;
        int countPlusMinus=0;
        int n=s.length();
        
        for(int i=0;i<n;i++){
            char ch=s.charAt(i);
            
            if(Character.isDigit(ch)){
                
                digitSeen=true;
                
            }
            else if(Character.toLowerCase(ch)=='e'){
                    if(eSeen || i==n-1 || !digitSeen)
                        return false;
                
                eSeen=true;
                
            }
            else if(ch=='.'){
                if(eSeen|| dotSeen || (!digitSeen && i==n-1))
                    return false;
                dotSeen=true;
                
            }else if(ch=='+' || ch=='-'){   
                if(countPlusMinus==2)
                    return false;
                if(i>0 && s.charAt(i-1)!='e' && s.charAt(i-1)!='E')
                    return false;
                if(i==n-1)
                    return false;
                
                countPlusMinus++;
                
            }
            else
                return false;
            
            
        }
        
        return true;
        
        
        
    }
}