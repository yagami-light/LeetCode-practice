class Solution {
    public int findNumberOfLIS(int[] nums) {
        
        int n=nums.length;
        int[] len=new int[n];
        int[] cnt=new int[n];
        int maxLen=1;
        int result=0;
        // // Arrays.fill(len,1);
        // Arrays.fill(cnt,1);
//         
        for(int i=0;i<n;i++){
            len[i] = cnt[i] = 1; 
            
            for(int j=0;j<i;j++){
                
                
                if(nums[i]> nums[j]){
                     if(len[i]==len[j]+1){
                        cnt[i]+=cnt[j];
                    }
                    if(len[i]<len[j]+1){
                        len[i]=len[j]+1;
                        cnt[i]=cnt[j];
                    }
                   
                    
                }
                // System.out.println("len is "+len[i]);
                // maxLen=Math.max(maxLen,len[i]);
                
            }
            
            if(maxLen==len[i])
                result+=cnt[i];
            if(maxLen<len[i]){
                result=cnt[i];
                maxLen=len[i];
            }
            
            
        }
        
        
//         for(int i=0;i<n;i++){
//             if(len[i]==maxLen)
//                 result+=cnt[i];
//         }
        
        
        
        return result;
    }
}