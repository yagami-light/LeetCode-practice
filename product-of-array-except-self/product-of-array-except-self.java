class Solution {
    public int[] productExceptSelf(int[] nums) {
        
        
        int[] prefixProduct=new int[nums.length];
        int[] result=new int[nums.length];
        int sum=1;
        for(int i=0;i<nums.length;i++){
            
            prefixProduct[i]=sum;
            sum*=nums[i];
            
        }
        
        sum=1;
        for(int i=nums.length-1;i>=0;i--){
            
            result[i]=sum*prefixProduct[i];
            sum*=nums[i];
            
        }
        
        
        return result;
        
        
    }
}