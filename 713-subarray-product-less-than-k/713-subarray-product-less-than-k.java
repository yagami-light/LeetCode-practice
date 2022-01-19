class Solution {
    public int numSubarrayProductLessThanK(int[] nums, int k) {
        if(k==0)
            return 0;
        int count=0;
        int product=1;
        for(int i=0,j=0;j<nums.length;j++){
            
            product *= nums[j];
            
            while(k<=product && i<= j)
                product /= nums[i++];
            
            count+=j-i+1;
            
        }
        
        
        return count;
    }
    
    
    
    
//        public int numSubarrayProductLessThanK(int[] nums, int k) {
//         if (k == 0) return 0;
//         int cnt = 0;
//         int pro = 1;
//         for (int i = 0, j = 0; j < nums.length; j++) {
//             pro *= nums[j];
//             while (i <= j && pro >= k) {
//                 pro /= nums[i++];
//             }
//             cnt += j - i + 1;
//         }
//         return cnt;        
//     }
}