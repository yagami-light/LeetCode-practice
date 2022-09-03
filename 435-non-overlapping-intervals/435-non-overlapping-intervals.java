class Solution {
    public int eraseOverlapIntervals(int[][] intervals) {
        
        Arrays.sort(intervals ,(a,b)->Integer.compare(a[1],b[1]));
        
        int count=0;
        int n=intervals.length;
        int end=intervals[0][1];
        for(int i=1;i<n;i++){
            
            int[] interval=intervals[i];
            if(interval[0] < end){
                count++;
                // end=interval[1];
            }else{
                
                end=interval[1];
                
                
            }
            
          
        }
         return count; 
    }
}