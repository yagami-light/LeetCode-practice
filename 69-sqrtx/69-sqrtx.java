class Solution {
    public int mySqrt(int x) {
        int ans=0;
        if(x==0) return 0;
        int start=0,end=Integer.MAX_VALUE;
        while(start<=end){
            
            int mid=(start+end)/2;
            if(mid <= x/mid){
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