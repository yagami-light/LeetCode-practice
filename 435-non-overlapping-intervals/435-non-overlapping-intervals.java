class Solution {
    public int eraseOverlapIntervals(int[][] intervals) {
        
        Arrays.sort(intervals,(a,b)->Integer.compare(a[1],b[1]));
        // System.out.println("print array :"+Arrays.deepToString(intervals));
        int count=0;
        int end=intervals[0][1];
        for(int i=1;i<intervals.length;i++){
            
            int[] interval=intervals[i];
            int nextEnd=interval[1];
            int nextStart=interval[0];
            if(nextStart<end){
                count++;
            }else{
                end=interval[1];
            }
            
            
        }
        
        return count;
        
    }
}

/*

[1,2],[2,3],[1,3],[3,4]


*/