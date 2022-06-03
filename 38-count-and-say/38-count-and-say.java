class Solution {
    public String countAndSay(int n) {
        if(n==1)
            return "1";
        
        String last=countAndSay(n-1);
        return getNextString(last);
        
    }
    
    
    
    private String getNextString(String last){
        if(last.length()==0)
            return "";
        
        int num=getRepeateNum(last);
        
        return num+""+last.charAt(0)+getNextString(last.substring(num));
    }
    
    
    private int getRepeateNum(String string) {
    int count = 1;
    char same = string.charAt(0);
    for (int i = 1; i < string.length(); i++) {
        if (same == string.charAt(i)) {
            count++;
        } else {
            break;
        }
    }
    return count;
}
    
    
    
    
}