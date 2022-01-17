class Solution {
//     public double[] medianSlidingWindow(int[] nums, int k) {
        
//         PriorityQueue<Integer> max=new PriorityQueue();
//         PriorityQueue<Integer> min=new PriorityQueue(Collections.reverseOrder());
//         int resultSize=nums.length-k+1;
//         double[] result=new double[resultSize];
//         int j=0;
//         for(int i=0;i<nums.length;i++){
            
//             min.add(nums[i]);
//             max.add(min.poll());
//             if(min.size()<max.size()) min.add(max.poll());
            
//             if(min.size()+max.size() == k){
                
                
//                 result[j]= min.size()==max.size() ? ((double)(((long)min.peek()+(long)max.peek())/2)) : (double) min.peek();
//                 if(!min.remove(nums[j]))
//                     max.remove(nums[j]);
                
//                 j++;
//             }
            
            
//         }
        
        
//         return result;
        
//     }
    
    
     public double[] medianSlidingWindow(int[] nums, int k) {
       double[] result = new double[nums.length - k + 1];
       int j=0;
       PriorityQueue<Integer> lo = new PriorityQueue<>(Collections.reverseOrder());
       PriorityQueue<Integer> hi = new PriorityQueue<>();
       for (int i = 0; i < nums.length; i++) {
            lo.add(nums[i]);
            hi.add(lo.poll());
            if(hi.size()>lo.size()) lo.add(hi.poll());
            if (lo.size() + hi.size() == k) {
                result[j]=lo.size()==hi.size()?(double)((long) lo.peek()+(long)hi.peek())/2:(double) lo.peek();
                if (!lo.remove(nums[j])) hi.remove(nums[j]);
                j++;
            }
        }
        return result;
    }
    
    
}