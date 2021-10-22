class Solution {
    public int getSum(int a, int b) {
        int and=b;
        int result=-1;
        while(and!=0){
        int xor= a^b;
         and=a&b;
        and=and <<1;
        
        result=and | xor;
        a=xor;
            b=and;
        }
        return a;
            
            
        
    }
}



/*

0001
0010
-----
0011 -XOR
0000- AND
0011- result



0010 -2
0011 -3
-------    
0001--XOR
0010-AND
0100- left AND
0101- result
    
    */