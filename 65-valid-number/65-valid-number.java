class Solution {
    public boolean isNumber(String s) {
        boolean digitSeen=false,eSeen=false,dotSeen=false;
        int countPlusMinus=0;
        
        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);
            if(Character.isDigit(c) || Character.toLowerCase(c)=='e' || c=='+' || c=='-' || c=='.'){
                System.out.println("character is "+c);
                if(Character.isDigit(c)){
                    digitSeen=true;
                }
                else if(c=='+' || c=='-'){
                    if(countPlusMinus==2)
                        return false;
                    if(i>0 && s.charAt(i-1)!='e' && s.charAt(i-1)!='E')
                        return false;
                    
                    if(i==s.length()-1)
                        return false;
                    
                    
                    
                    countPlusMinus++;
                }
                else if(c=='.'){
                    if(eSeen || dotSeen)
                        return false;
                    
                    if(i==s.length()-1 && digitSeen==false)
                        return false;
                    dotSeen=true;
                }
                
                else if(c=='e' || c=='E'){
                    if(eSeen || digitSeen==false || i==s.length()-1)
                        return false;
                    eSeen=true;
                    
                }
                else
                    return false;
                
                
            }
            else
                return false;
            
            
        }
        
        return true;
    }
}