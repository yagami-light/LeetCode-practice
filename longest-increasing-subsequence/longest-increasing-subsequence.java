class Solution {
    public int lengthOfLIS(int[] arr) {
        int[] dp=new int[arr.length];
        Arrays.fill(dp,1);
        if(arr.length==1)
            return 1;
        
        
        for(int i=1;i<arr.length;i++){
            
          
            for(int j=0;j<i;j++){
                
                if(arr[j]<arr[i]  && dp[i] < dp[j]+1){
                    dp[i]=1+dp[j];
                }
                
                
                
            }
            
            
            
        }
        
        
        return Arrays.stream(dp).max().getAsInt();
        
        
        
        
    }
}