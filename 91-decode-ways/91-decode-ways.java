class Solution {
    public int numDecodings(String s) {
        int n=s.length();
        int[] dp=new int[n+1];
     
        dp[0]=1;
        dp[1]=s.charAt(0)!='0' ? 1 : 0;
        
        
        for(int i=2;i<=n;i++){
            
            String singleDigit=s.substring(i-1,i);
            // System.out.println(singleDigit);
            int sinleDigitInt=Integer.parseInt(singleDigit);
            if(sinleDigitInt >=1 && sinleDigitInt<=9)
                dp[i]+=dp[i-1];
            
            String doubleDigit=s.substring(i-2,i);
            // System.out.println(doubleDigit);
            int doubleDigitInt=Integer.parseInt(doubleDigit);
            if(doubleDigitInt>=10 && doubleDigitInt<=26)
                dp[i]+=dp[i-2];
            
            
            
        }
        
        return dp[n];
        
        
        // return 1;
        
    }
}