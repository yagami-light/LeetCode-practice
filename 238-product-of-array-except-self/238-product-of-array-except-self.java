class Solution {
    public int[] productExceptSelf(int[] nums) {
        
        int mul=1;
        int n=nums.length;
        int[] prefixMul=new int[n];
        for(int i=0;i<n;i++){
            prefixMul[i]=mul;
            mul *= nums[i];
        }
        
        System.out.println("prefix mul : "+Arrays.toString(prefixMul));
        
        mul=1;
        for(int i=n-1;i>=0;i--){
            prefixMul[i]=prefixMul[i]*mul;
            mul *= nums[i];
            
        }
        
        return prefixMul;
    }
}