class Solution {
    public boolean isHappy(int n) {
        int count=0;
        int fast=n;
        int slow=n;
        
       do{
            fast=sumOfDigitSquare(sumOfDigitSquare(fast));
           // fast=sumOfDigitSquare(fast);
            slow=sumOfDigitSquare(slow);
        } while(slow!=fast);
        
        if(slow==1)
            return true;
        else return false;
        
        
        
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