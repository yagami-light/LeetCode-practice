class Solution {
    public int numDecodings(String s) {
        
        return numDecodeUtil(s);
    }
    
    private int numDecodeUtil(String s){
        int n=s.length();
        int[] dp=new int[n+1];
        
        int res=0;
        dp[0]=1;
        dp[1]=s.charAt(0)!='0' ? 1 : 0;
        for(int i=2;i <= n;i++){
            
            String firstDigit=s.substring(i-1,i);
            int firstDigitInt=Integer.parseInt(firstDigit);
            System.out.println("firstDigitInt "+firstDigitInt);

            if(firstDigitInt >=1 && firstDigitInt <=9){
                System.out.println("firstDigitInt "+firstDigitInt);

                dp[i]+=dp[i-1];
            }
            
            String secondDigit=s.substring(i-2,i);
            int secondDigitInt=Integer.parseInt(secondDigit);
            
            System.out.println("secondDigitInt "+secondDigitInt);
            if(secondDigitInt>=10 && secondDigitInt<=26)
                dp[i]+=dp[i-2];
            
           
            
            
            
        }
        
        
        return dp[s.length()];
        
        
        
        
    }
    
}