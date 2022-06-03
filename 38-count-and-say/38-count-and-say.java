class Solution {
    public String countAndSay(int n) {
        if(n==1)
            return "1";
        
        String last=countAndSay(n-1);
        
        return getNextNumber(last);
        
    }
    
    private String getNextNumber(String last){
        if(last.length()==0)
            return "";
        
        int num=getRepeateNum(last);
        
        return num+""+last.charAt(0)+getNextNumber(last.substring(num));
        
    }
    
    
    private int getRepeateNum(String last){
        if(last.length()==0)
            return 0;
        int count=1;
        char initChar=last.charAt(0);
        for(int i=1;i<last.length();i++){
            if(initChar==last.charAt(i))
                count++;
            else
                break;
        }
        
        
        return count;
        
    }
    
    
}