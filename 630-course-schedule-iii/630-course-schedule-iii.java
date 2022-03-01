class Solution {
    public int scheduleCourse(int[][] courses) {
        
        Arrays.sort(courses,(a,b)->Integer.compare(a[1],b[1]) != 0 ? Integer.compare(a[1],b[1]) : Integer.compare(a[0],b[0]));
//         
        // System.out.println("print array "+Arrays.deepToString(courses));
        
        PriorityQueue<int[]> pq=new PriorityQueue<>((a,b)->Integer.compare(b[0],a[0]));
        
        
        int currDay=0;
        int count=0;
        
        for(int[] course:courses){
            
            if(currDay+course[0]<=course[1]){
                
                currDay+=course[0];
                pq.add(course);
            }else if(!pq.isEmpty() && currDay-pq.peek()[0]+course[0]<=currDay){
                
                currDay=currDay-pq.peek()[0]+course[0];
                pq.remove();
                pq.add(course);
                
                
            }
            
        }
        
        
        
        return pq.size();
        
        
    }
}