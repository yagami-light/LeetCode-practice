class Solution {
    public int[] countBits(final int n) {
        
      return  IntStream.rangeClosed(0,n).map(k->countBitsUtil(k)).toArray();
      
    }
    
    private int countBitsUtil(final int n){
          int count=0;
        int number=n;
        while(number!=0){
            if((number & 1) == 1){
                count++;
            }
            number=number>>>1;
            
            
        }
        
        return count;
    }
    
}