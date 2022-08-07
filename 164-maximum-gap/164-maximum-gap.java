class Solution {
    public int maximumGap(int[] nums) {
        
        int min=Integer.MAX_VALUE;
        int max=Integer.MIN_VALUE;
        
        for(int i:nums){
            min=Math.min(i,min);
            max=Math.max(i,max);
        }
        
        int interval=(int)Math.ceil((max-min+0.0)/(nums.length-1));
        
        int[] minGroup=new int[nums.length-1];
        int[] maxGroup=new int[nums.length-1];
        
        Arrays.fill(minGroup,Integer.MAX_VALUE);
        Arrays.fill(maxGroup,Integer.MIN_VALUE);
        
        for(int i: nums){
            if(i==min || i==max) continue;
            int index= (i-min)/interval;
            minGroup[index]=Math.min(minGroup[index],i);
            maxGroup[index]=Math.max(maxGroup[index],i);

        }
        int prev=min;
        int maxDiff=0;
        for(int i=0;i<minGroup.length;i++){
            if(maxGroup[i]==Integer.MIN_VALUE) continue;
            maxDiff=Math.max(maxDiff,minGroup[i]-prev);
            prev=maxGroup[i];
            
        }
        
        System.out.println("minGroup :"+Arrays.toString(minGroup));
        System.out.println("maxGroup :"+Arrays.toString(maxGroup));

         maxDiff=Math.max(maxDiff,max-prev);
        return maxDiff;
        
    }
}