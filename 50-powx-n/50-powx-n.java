class Solution {
    public double myPow(double x, int n) {
        int sign=n>=0 ? 1: -1;
        
        if(x==1) return 1;
        if(x==-1) return n%2==0 ? 1 : -1;
                if(n==Integer.MIN_VALUE) return 0;

        n=Math.abs(n);
        if(sign==1) return myPowCust(x,n);
        else
            return 1/myPowCust(x,n);
        
        
        
        
    }
    
    public double myPowCust(double x,int n){
        
        
        if(n==0)
            return 1;
        else{
            
            if(n%2==0)
            {
                double res=myPowCust(x,n/2);
                return res*res;
            }else{
                double res=myPowCust(x,n/2);
                return res*res*x;
            }
            
            
        }
        
        
        
        
    }
    
    
}