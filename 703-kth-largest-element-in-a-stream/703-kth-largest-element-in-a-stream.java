class KthLargest {
    
    
    PriorityQueue<Integer> pq;
    int size;

    public KthLargest(int k, int[] nums) {
        
        pq=new PriorityQueue<>(k);
        size=k;
        for(int c:nums){
            pq.add(c);
            if(pq.size()>size)
                pq.remove();
            
            
        }
        
        
        
        
    }
    
    public int add(int val) {
        
        pq.add(val);
        if(pq.size()>size)
            pq.remove();
        
        
        return pq.peek();
        
        
        
    }
}

/**
 * Your KthLargest object will be instantiated and called as such:
 * KthLargest obj = new KthLargest(k, nums);
 * int param_1 = obj.add(val);
 */



/*

2,4,2,3,3,5,6,3
----

2,2,3,3,3,4,5,6


3 largeest element




*/