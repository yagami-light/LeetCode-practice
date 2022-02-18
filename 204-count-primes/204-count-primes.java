class Solution {
    public int countPrimes(int n) {
        int count=0;
        boolean[] dp=new boolean[n];
        if(n<=2)
            return 0;
        
        for(int i=2;i<n;i++){
            
            if(dp[i]==false){
                // System.out.println("number is "+i);
                dp[i]=true;
                count++;
                   
            }
            else if(dp[i]==true)
                continue;
            
            for(int j=2;j*i<n;j++){
                if(dp[j*i]!=true)
                    dp[j*i]=true;
                
                
            }
            
        }
        
        return count;
        
        
        
    }
    
    
   
    
    
    
    
}