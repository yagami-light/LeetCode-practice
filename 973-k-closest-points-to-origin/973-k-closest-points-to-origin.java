class Solution {
    public int[][] kClosest(int[][] points, int k) {
        // PriorityQueue<int[]> pq = new PriorityQueue<>(k, (a,b) -> Integer.compare(a[1],b[1]));

        PriorityQueue<int[]> pq=new PriorityQueue<>(k,(a,b)->Integer.compare(((b[0]*b[0])+(b[1]*b[1])),((a[0]*a[0])+(a[1]*a[1]))));
        int sizeOfPoints=points.length;
        
        
        for(int i=0;i<sizeOfPoints;i++){
            
            
            pq.add(points[i]);
            if(pq.size()>k)
                pq.remove();
            
            
        }
        
        int[][] result=new int[k][];
        for(int i=0;i<k;i++){
            
            result[i]=pq.remove();
            
            
        }
        
        
        return result;
        
        
        
        
        
    }
}




/*
1,4,5,6,3,7
    
    
K=3

result: 1,3,4




4
3
1    
    
    
    
    
*/    