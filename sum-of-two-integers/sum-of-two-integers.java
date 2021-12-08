class Solution {
    public int getSum(int a, int b) {
        
        /*
        
        3 110
        2 010
        ------
        5 101
        
        */
        
        if(b==0)
            return a;
        int carry=a&b;
        int xor=a^b;
        
        return getSum(xor , (carry << 1));
        
        
    }
}