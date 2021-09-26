class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n=nums.length;
        int[] prefix=new int[n];
        int sum=1;
        for(int i=1;i<n;i++){
            
            sum*=nums[i-1];
            prefix[i]=sum;
        }
        
        // System.out.println("prefix array "+Arrays.toString(prefix));
        int[] result=new int[n];
        sum=1;
        for(int i=n-1;i>=0;i--){
            
           
            
            result[i]=prefix[i]*sum;
             if(i==0)
                result[i]=sum;
            sum=sum*nums[i];
           
            // System.out.println("result[i] "+result[i]);
        }
        
        return result;
    }
}