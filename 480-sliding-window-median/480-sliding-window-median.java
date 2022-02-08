class Solution {
    public double[] medianSlidingWindow(int[] nums, int k) {
        
        PriorityQueue<Integer> large=new PriorityQueue<>(Collections.reverseOrder());
        PriorityQueue<Integer> small=new PriorityQueue<>();
        int j=0;
        double[] res=new double[nums.length-k+1];
        int count=0;
        
        for(int n:nums){
            
            small.add(n);
            large.add(small.remove());
            if(large.size() > small.size())
                small.add(large.remove());
            
            if(small.size() + large.size() == k){
                
               if(small.size() ==large.size())
                    res[count++]=(double)((long)small.peek()+(long)large.peek())/2;
                else
                    res[count++]=(double)(small.peek());
                if(!small.remove(nums[j]))
                large.remove(nums[j]);
                j++;
                
            }
            
            
            
        }
        
        return res;
        
        
        
    }
}