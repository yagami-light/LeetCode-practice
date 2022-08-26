class Solution {
    Map<Integer,Integer> map=new HashMap();
    public int findMaxLength(int[] nums) {
        int n=nums.length;
        int[] prefixSum=new int[n];
        int sum=0;
        for(int i=0;i<n;i++){
            
            sum +=( nums[i] == 0 ? -1 : nums[i]);
            prefixSum[i]=sum;
        }
         // System.out.println("print array :"+Arrays.toString(prefixSum));
        int max=Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
           
            if(prefixSum[i]==0)
            max=Math.max(max,i+1);
            if(map.containsKey(prefixSum[i])){
             max=Math.max(max,i-map.get(prefixSum[i]));   
            }
             map.putIfAbsent(prefixSum[i],i);
        }
        return max==Integer.MIN_VALUE ? 0 : max;
        
        // System.out.println("print array :"+Arrays.toString(prefixSum));
        
        // return 1;
        
    }
}