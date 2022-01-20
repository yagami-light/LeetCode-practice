class Solution {
    public int findNumberOfLIS(int[] nums) {
        int n=nums.length;
        int[] cnt=new int[n]; 
        int[] len=new int[n];
        int res=0;
        int maxLen=1;
        
        
        for(int i=0;i<n;i++){
            
            cnt[i]=len[i]=1;
            
            for(int j=0;j<i;j++){
                
                if(nums[i]>nums[j]){
                if(len[i]==len[j]+1){
                    cnt[i]+=cnt[j];
                    
                }
                
                
                if(len[i]<len[j]+1){
                    
                    len[i]=len[j]+1;
                    cnt[i]=cnt[j];
                    
                }
                    
                }
            }
            
            
            // maxLen=Math.max(maxLen,len[i]);
            if(len[i]==maxLen){
                
                res+=cnt[i];
                
            }
            if(len[i]>maxLen){
                
                res=cnt[i];
                maxLen=len[i];
            }
            
            
            
            
            
            
        }
        
        
        return res;
        
        
        
        
        
        
    }
}