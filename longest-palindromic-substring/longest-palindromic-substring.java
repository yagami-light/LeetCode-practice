class Solution {
    public String longestPalindrome(String s) {
        
        return longestPalUtil(s);
    }
    
    
    private String longestPalUtil(String s){
        int[] lo=new int[1];
        int[] maxLen=new int[1];
        if(s.length()==1)
            return s;
        for(int i=0;i<s.length()-1;i++){
            longestPalUtil(s,i,i,lo,maxLen);
            longestPalUtil(s,i,i+1,lo,maxLen);
        }
        
        
        System.out.println("min index "+lo[0] + "max length "+maxLen[0]);
        return s.substring(lo[0],lo[0]+maxLen[0]);
    }
    
    
    
    private void longestPalUtil(String s, int i,int j, int[] lo,int[] maxLen){
        
        while(i>=0 && j<s.length() && s.charAt(i)==s.charAt(j) ){
            i--;
            j++;
        }
        
        
        if(maxLen[0]<(j-i-1)){
            maxLen[0]=j-i-1;
            lo[0]=i+1;
            // System.out.println("new min index "+lo[0] + "max length "+maxLen[0]);

        }
        
        
        
    }
    
}