class Solution {
    public int singleNumber(int[] nums) {
        int sum=0;
        for(int i=0;i<32;i++){
            int count=0;
            for(int k=0;k<nums.length;k++){
            if((nums[k]>>>i & 1) ==1)
                count++;
                
                
            }
            if(count %3!=0){
                sum+=1<<i;
            }
        }
        
        
        return sum;
        
        
    }
}