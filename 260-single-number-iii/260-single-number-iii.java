class Solution {
    public int[] singleNumber(int[] nums) {
        
        int xor=0;
        
        for(int n:nums)
            xor ^= n;
        
        
        int bitSetNumber= xor & -xor;
        int[] res=new int[2];
        for(int n:nums){
            
            if((bitSetNumber & n) ==0){
                res[0] ^= n;
            }else
                res[1] ^=n;
            
        }
        
        return res;
        
    }
}