class Solution {
    public boolean isUgly(int n) {
        // System.out.println("Inte min :"+Integer.MIN_VALUE);
        // System.out.println("int input : "+n);
        if(n%2 ==0){
            // System.out.println("test "+  +n/2);
        }
        if(n==0) return false;
        if(n==1) return true;
        else{
            
            return (((n %2 ==0) && isUgly(n>>1))
        || ((n %3 ==0) && isUgly(n/3))
        || ((n %5 ==0) && isUgly(n/5)));
            
        }
        
    }
}