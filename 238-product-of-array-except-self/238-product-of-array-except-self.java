class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n=nums.length;
        int[] prefixMul=new int[n];
        int[] res=new int[n];
        int mul=1;
        for(int i=0;i<n;i++){
            prefixMul[i]=mul;
            mul *= nums[i];
        }
        // System.out.println("print array : "+Arrays.toString(prefixMul));
         mul=1;
        for(int i=n-1;i>=0;i--){
            res[i]= prefixMul[i]*mul;
             mul=mul*nums[i];
            
        }
        // nums[0] *=mul;
        return res;
        
        
    }
}

/*

[1,2,3,4]

[1,1,2,6]

[a1,a2,a3,a4]

[1*a2*a3*a4, a1*a3*a4, a1*a2*a4, a1*a2*a3]


[1 , a1, a1*a2,a1*a2*a3]



*/