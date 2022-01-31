class Solution {
    public int findMaxValueOfEquation(int[][] points, int k) {
        PriorityQueue<Pair<Integer,Integer>> pq=new PriorityQueue<>(( a, b)->(
            Integer.compare(b.getKey(),a.getKey()) == 0 ? 
            (Integer.compare(a.getValue(),b.getValue())) : 
            (Integer.compare(b.getKey(),a.getKey())))
        );
        int result=Integer.MIN_VALUE;
        
        for(int[] point: points){
            
            
            while(!pq.isEmpty() &&  point[0]-pq.peek().getValue() > k)
                pq.remove();
            
            if(!pq.isEmpty())
            result=Math.max(result,pq.peek().getKey()+point[0]+point[1]);
            pq.add(new Pair(point[1]-point[0],point[0]));
            
        }
        
        
        return result;
        
        
    }
}

/*

yi + yj + |xi - xj|
xi<xj

yi+yj+|xj-xi|

(xj+yj) + (yi-xi)



*/