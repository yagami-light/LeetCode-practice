class Solution {
    public int mySqrt(int x) {
        
        return mySqrtUtil(x);
    }
    
    private int mySqrtUtil(int x){
        if(x==0)
            return x;
     
        for(int i=1;(i*i)<=(x);i++){
            if((i) <=(x/i) && ((i+1))>(x/(i+1))){
                System.out.println("i*i "+ (i*i));
                return i;
            }
        }
        
        return -1;
        
    }
    
}