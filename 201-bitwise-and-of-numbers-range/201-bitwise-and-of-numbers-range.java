class Solution {
    public int rangeBitwiseAnd(int left, int right) {
        int m=left;
        int n=right;
        int count=0;
        while(m!=n){
            
            m=m>>1;
            n=n>>1;
            count++;
            
        }
        
        return m<<count;
        
    }
}