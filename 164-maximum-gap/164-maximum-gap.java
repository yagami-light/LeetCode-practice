class Solution {
    public int maximumGap(int[] nums) {
        if(nums==null || nums.length<2) return 0;
        
        int max=nums[0];
        for(int i:nums)
            max=Math.max(max,i);
        
        int exp=1;
        int DIGIT=10;
        int[] aux=new int[nums.length];
        while(max/exp>0){
            
            int[] count=new int[DIGIT];
            for(int i=0;i<nums.length;i++){
                
                count[(nums[i]/exp) % 10]++;
                
            }
            
            for(int i=1;i<count.length;i++){
                count[i]+=count[i-1];
            }
            for(int i=nums.length-1;i>=0;i--){
                
                aux[--count[(nums[i]/exp)%10]]=nums[i];
            }
            
            for(int i=0;i<nums.length;i++)
                    nums[i]=aux[i];
        
            exp*=10;
            
        }
        
        System.out.println("nums :"+Arrays.toString(nums));
        int maxDiff=0;
       for(int i=1;i<nums.length;i++)
           maxDiff=Math.max(maxDiff,nums[i]-nums[i-1]);
        
        return maxDiff;
        
        
    }
}