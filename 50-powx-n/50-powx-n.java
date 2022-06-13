class Solution {
    public double myPow(double x, int n) {
        if(x==1) return 1;
        if(x==-1) return n%2==0 ? 1: -1;
        System.out.println(Integer.MIN_VALUE);
        if(n==Integer.MIN_VALUE) return 0;
                
        int sign=n>=0 ? 1 : -1;
        double res=1;
        n=Math.abs(n);
        for(int i=0;i<n;i++){
            res*=x;
        }
        
        return sign==1 ? res : 1/res;
        
    }
}