class Solution {
    public int[] productExceptSelf(int[] nums) {
        int size=nums.length;
        int[] result=new int[size];
        
        int product=1;
        
        for(int i=0;i<size;i++){
            result[i]=product;
            product *= nums[i];
        }
        
        product=1;
        for(int i=size-1;i>=0;i--){
            result[i]*= product;
            product *= nums[i];
        }
        
        return result;
        
    }
}