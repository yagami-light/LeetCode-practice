class Solution {
    public List<String> restoreIpAddresses(String s) {
        int len=s.length();
        List<String> res=new ArrayList();
        for(int i=1;i<4 && i<len-2;i++){
            
            
            for(int j=i+1;j<i+4 && j< len-1;j++){
                
                
                for(int k=j+1;k<k+4 && k < len;k++){
                    
                    String str1=s.substring(0,i);
                    String str2=s.substring(i,j);
                    String str3=s.substring(j,k);
                    String str4=s.substring(k,len);
                    
                    if(isValid(str1) && isValid(str2) && isValid(str3) && isValid(str4)){
                        res.add(str1+"."+str2+"."+str3+"."+str4);
                        
                    }
                    
                    
                    
                    
                }
                
                
            }
            
            
        }
        return res;
        
    }
    
    private boolean isValid(String s){
        if(s.length()>3 || s.length()==0 || (s.charAt(0)=='0' && s.length()>1) || Integer.parseInt(s)>255)
            return false;
        return true;
    }
    
}