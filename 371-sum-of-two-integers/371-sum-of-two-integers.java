class Solution {
    public int getSum(int a, int b) {
        
        if(b==0)
            return a;
        
        int and= a& b;
        int xor= a^b;
        
        return getSum(xor,and<<1);
        
        
    }
}