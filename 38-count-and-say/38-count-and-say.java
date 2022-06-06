class Solution {
    public String countAndSay(int n) {
        String res="1";
        
        for(int i=1;i<n;i++){
            String temp="";
            for(int j=0;j<res.length();j++){
                int num=getRepeatedString(res.substring(j));
                temp=temp+num+""+res.charAt(j);
                j=j+num-1;
            }
            
            
            res=temp;
        }
        return res;
        
        
    }
    
    private int getRepeatedString(String str){
        int count=1;
        if(str.length()==0)
            return 0;
        
        char first=str.charAt(0);
        for(int i=1;i<str.length();i++){
            if(str.charAt(i)==first)
                count++;
            else
                break;
        }
        
        return count;
        
        
    }
    
    
}