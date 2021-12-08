class Solution {
    public int[] countBits(int n) {
        int[] result=new int[n+1];
        result[0]=0;
        //result[1]=1;
        
        
        for(int i=0;i<=n;i++){
         
            result[i]=result[i>>1] + (i&1);
        }
        
        
        return result;
        
    }
}