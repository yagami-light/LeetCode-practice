class Solution {
    public int[][] merge(int[][] intervals) {
        if(intervals.length<=1)
            return intervals;
        
        Arrays.sort(intervals,(a,b)->Integer.compare(a[0],b[0]));
        LinkedList<int[]> res=new LinkedList();
        int[] newinterval=intervals[0];
        // res.add(newinterval);
        for(int[] currInterval:intervals){
           
            if(!res.isEmpty() && res.getLast()[1] >= currInterval[0]){
                res.getLast()[1]=Math.max(res.getLast()[1],currInterval[1]);
                
            }else{
                res.add(currInterval);
            }
            
            
        }
        
        
        return res.toArray(new int[0][]);
        
    }
}