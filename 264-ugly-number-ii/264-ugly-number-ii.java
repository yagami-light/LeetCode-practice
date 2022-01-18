class Solution {
    public int nthUglyNumber(int n) {
        if(n==1)
            return 1;
        // PriorityQueue<Long> pq=new PriorityQueue<>();
        TreeSet<Long> pq=new TreeSet();
        pq.add(1L);
       
        for(int i=1;i<n;i++){
            long num=pq.pollFirst();
            // while(!pq.isEmpty() && pq.peek()== num) num=pq.poll();
            pq.add(2*num);
            pq.add(3*num);
            pq.add(5*num);
            
        }
        
        
        
        
        
        return pq.pollFirst().intValue();

    }
}


/*


1
2
3
5


*/