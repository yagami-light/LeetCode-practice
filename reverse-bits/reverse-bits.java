public class Solution {
    // you need treat n as an unsigned value
    public int reverseBits(int n) {
        
        int result=0;
        int number=n;
        
        
        
        for(int i=0;i<32;i++){
            result= result << 1;
            
            if((number & 1 ) == 1)
                result  = result | 1;
            
            number = number >>> 1;
        }
        
        return result;
    }
}