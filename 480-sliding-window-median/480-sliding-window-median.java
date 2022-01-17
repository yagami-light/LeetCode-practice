class Solution {
    public double[] medianSlidingWindow(int[] nums, int k) {
        
        PriorityQueue<Integer> min=new PriorityQueue();
        PriorityQueue<Integer> max=new PriorityQueue(Collections.reverseOrder());
        int resultSize=nums.length-k+1;
        double[] result=new double[resultSize];
        int j=0;
        for(int i=0;i<nums.length;i++){
            
            min.add(nums[i]);
            max.add(min.poll());
            if(min.size()<max.size()) min.add(max.poll());
            
            if(min.size()+max.size() == k){
                
                
                result[j]= min.size()==max.size() ? (double)((long) min.peek()+(long)max.peek())/2 : (double) min.peek();
                if(!min.remove(nums[j]))
                    max.remove(nums[j]);
                
                j++;
            }
            
            
        }
        
        
        return result;
        
    }
    
    
    
}