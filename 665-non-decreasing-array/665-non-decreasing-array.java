class Solution {
    public boolean checkPossibility(int[] nums) {
        
        
//         int cnt=0;
        
        
//         for(int i=1;i<nums.length&&cnt<=1;i++){
            
//             if(nums[i-1]>nums[i-1]){
//                 cnt++;
                
                
//                 if(i-2<0 || nums[i-2] <= nums[i])
//                         nums[i-1]=nums[i];
//                 else
//                     nums[i]=nums[i-1];
                
                
//             }
            
            
            
            
//         }
        
//         return  cnt<=1;
        
        
        
        
            int cnt = 0;                                                                    //the number of changes
        for(int i = 1; i < nums.length && cnt<=1 ; i++){
            if(nums[i-1] > nums[i]){
                cnt++;
                if(i-2<0 || nums[i-2] <= nums[i])nums[i-1] = nums[i];                    //modify nums[i-1] of a priority
                else nums[i] = nums[i-1];                                                //have to modify nums[i]
            }
        }
        return cnt<=1; 
    }
    
    
     public boolean checkPossibility1(int[] nums) {
        int cnt = 0;                                                                    //the number of changes
        for(int i = 1; i < nums.length && cnt<=1 ; i++){
            if(nums[i-1] > nums[i]){
                cnt++;
                if(i-2<0 || nums[i-2] <= nums[i])nums[i-1] = nums[i];                    //modify nums[i-1] of a priority
                else nums[i] = nums[i-1];                                                //have to modify nums[i]
            }
        }
        return cnt<=1; 
    }
    
}