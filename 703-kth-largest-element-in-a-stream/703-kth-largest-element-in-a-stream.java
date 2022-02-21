class KthLargest {

    PriorityQueue<Integer> pq;
    int k;
    
    public KthLargest(int k, int[] nums) {
        this.k=k;
        pq=new PriorityQueue<>();
        for(int n: nums){
            pq.add(n);
            if(pq.size()>k)
                pq.remove();
            
        }
        
        System.out.println(pq);
        
    }
    
    public int add(int val) {
                // System.out.println("insert"+pq);

        pq.add(val);
                        // System.out.println("inserted "+pq);
                // System.out.println("inserted size"+pq.size());
        // System.out.println("k value "+k);

        if(pq.size() > k)
            pq.remove();
        
        System.out.println(val);
        
        return pq.isEmpty() ? -1 : pq.peek();
        
    }
}

/**
 * Your KthLargest object will be instantiated and called as such:
 * KthLargest obj = new KthLargest(k, nums);
 * int param_1 = obj.add(val);
 */


/*


1
2
3
4



*/