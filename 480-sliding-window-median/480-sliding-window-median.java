class Solution {
    public double[] medianSlidingWindow(int[] nums, int k) {
        
        PriorityQueue<Integer> large=new PriorityQueue<>(Collections.reverseOrder());
        PriorityQueue<Integer> small=new PriorityQueue<>();
        double[] res=new double[nums.length-k+1];
        int count=0;
        
        for(int i=0,j=0;i<nums.length;i++){
            
            small.add(nums[i]);
            large.add(small.remove());
            
            if(small.size() < large.size()){
                
                small.add(large.remove());
                // small.remove();
                
                
            }
            
            
            if(small.size()+large.size()==k){
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