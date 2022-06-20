class Solution {
    public int mySqrt(int x) {
        int ans=0;
        long start=0,end=Integer.MAX_VALUE;
        while(start<=end){
            
            long mid=(start+end)/2;
            if(mid* mid <= x){
                ans=(int)mid;
                start=mid+1;
            }else 
            {
                end=mid-1;
            }
            
            
            
            
        }
        return ans;
        
        
        
    }
}