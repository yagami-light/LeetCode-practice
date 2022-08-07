class Solution {
    public int maximumGap(int[] nums) {
        if(nums==null || nums.length < 2) return 0;
        
        int max=nums[0];
        
        for(int i: nums){
            max=Math.max(max,i);
        }
        
        int[] aux=new int[nums.length];
        int exp=1;
        int R=10;
        
        while(max/exp>0){
            
            int[] count=new int[R];
            /*
            for(int i=0;i<count.length;i++){
                System.out.println("print index :"+(nums[i]/exp) % 10);
                count[(nums[i]/exp) % 10]++;
            }
            
            */
            
             for (int i = 0; i < nums.length; i++) {
            count[(nums[i] / exp) % 10]++;
        }
            
            System.out.println("print count :"+Arrays.toString(count));
            
            for(int i=1;i<count.length;i++)
                count[i]+=count[i-1];
            System.out.println(" again print count:"+Arrays.toString(count));
            
            for(int i=nums.length-1;i>=0;i--){
                aux[--count[(nums[i]/exp)%10]]=nums[i];
            }
            
                        System.out.println("thried print count :"+Arrays.toString(count));

            
            for(int i=0;i<aux.length;i++)
                nums[i]=aux[i];
            
            exp*=10;
            
        }
        
        System.out.println("print Array :"+Arrays.toString(nums));
        int maxDiff=0;
        for(int i=1;i<nums.length;i++){
            System.out.println("alex");
            maxDiff=Math.max(maxDiff,nums[i]-nums[i-1]);
            
        }
        
        return maxDiff;
        
        
    }
}