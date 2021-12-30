class Solution {
    public int strStr(String haystack, String needle) {
        
        int m=haystack.length();
        int n=needle.length();
        
        for(int i=0;;i++){
            
            for(int j=0;;j++){
                
                if(j==n)
                    return i;
                if(i+j == m)
                    return -1;
                
                if(needle.charAt(j) != haystack.charAt(i+j))
                    break;
                
                
            }
            
        }
        
        // return -1;
    }
}