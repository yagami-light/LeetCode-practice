class Solution {
    public int[][] merge(int[][] intervals) {
        if(intervals.length<=1)
            return intervals;
        
        Arrays.sort(intervals,(a,b)->Integer.compare(a[0],b[0]));
        List<int[]> res=new ArrayList();
        int[] newinterval=intervals[0];
        res.add(newinterval);
        for(int[] currInterval:intervals){
            
            if(newinterval[1]>=currInterval[0]){
                
                newinterval[1]=Math.max(newinterval[1],currInterval[1]);
                
            }else{
                
                res.add(currInterval);
                newinterval=currInterval;
            }
            
            
        }
        
        
        return res.toArray(new int[0][]);
        
    }
}