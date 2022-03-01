class Solution {
    public int findKthLargest(int[] nums, int k) {
        
    PriorityQueue<Integer> pq=new PriorityQueue<>();
    
    for(int n : nums){
        pq.add(n);
        if(pq.size()>k)
            pq.remove();
    }    
     
        
        return pq.peek();
        
    }
    
    /*
    
    1,2,3,4,5,6
    
    
    1
    2
    3
    
    
    */
    
    
    
    
    
    
}