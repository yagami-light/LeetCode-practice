class Solution {
    public boolean isHappy(int n) {
        int count=0;
        while(true){
            
            n=sumOfDigitSquare(n);
            if(n==1)
                return true;
            if(count>10000)
                return false;
            count++;
            
        }
       
        
        
        
    }
    
    private int sumOfDigitSquare(int n){
        if(n<10)
            return n*n;
        else
        {
            return ((n%10)*(n%10)) +sumOfDigitSquare(n/10);
            
            
            
        }
            
    }
    
    
    
    
}

/*

123




*/