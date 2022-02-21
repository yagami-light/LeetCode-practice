class Solution {
    public int findLengthOfLCIS(int[] nums) {
        int n=nums.length,cnt=0;
        int res=1;
        
        
        for(int i=0;i<n;i++){
            
            if(i>0 && nums[i]>nums[i-1]){
                cnt++;
                res=Math.max(cnt,res);
                
            }else{
                cnt=1;
            }
            
            
            
            
        }
        return res;
        
        
    }
}