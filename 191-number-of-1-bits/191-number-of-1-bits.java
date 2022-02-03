public class Solution {
    // you need to treat n as an unsigned value
    public int hammingWeight(int n) {
        int count=0;
        // n=Math.abs(n);
        System.out.println(n);
        while(n!=0){
            if((n & 1) != 0)
            count++;
            n= n>>>1;
            // System.out.println(Integer.toBinaryString(n));
        }
        
        return count;
        
        
    }
}