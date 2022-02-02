class Solution {
    public int minSubArrayLen(int k, int[] nums) {
          int n=nums.length;
        int sum=0;
        int start=0;
        int end=0;
        int min=Integer.MAX_VALUE;
        while(end<n && start <n){
         
            while(sum<k && end <n)
                sum+=nums[end++];
            System.out.println(" before  start "+start +" end "+end +" and sum "+sum +" and n"+n);

            if(sum<k && end == n){
                System.out.println(" if start "+start +" end "+end +" and sum "+sum);

                System.out.println("breaking ");
                break;
                
            }
            System.out.println("start "+start +" end "+end +" and sum "+sum);
            
            while(sum>=k && start <n)
                sum-=nums[start++];
            
            System.out.println("now start "+start +" end "+end);
            
            min=Math.min(min,end-(start-1));
            // start++;
            
        }
        
        
        return min==Integer.MAX_VALUE ? 0 : min;
        
        
        
    }
    }
