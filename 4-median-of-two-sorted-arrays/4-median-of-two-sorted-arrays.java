class Solution {
    public double findMedianSortedArrays(int[] a, int[] b) {
              int n1=a.length;
        int n2=b.length;
            
        if(n1>n2) return findMedianSortedArrays(b,a);
        return helper(a,b,0,a.length);
    }
    
      private static double helper(int[] a,int[] b,int start,int end){
      
        if(start>end) return -1;
        int n1=a.length;
        int n2=b.length;
        int mid1=(start+end)/2;
        int mid2=(n1+n2)/2-mid1;
        int L1=mid1 == 0 ? Integer.MIN_VALUE : a[mid1-1];
        int L2= mid2 == 0 ? Integer.MIN_VALUE : b[mid2-1];
        int R1=(mid1==n1) ? Integer.MAX_VALUE : a[mid1];
        int R2=(mid2==n2) ? Integer.MAX_VALUE : b[mid2];
       System.out.println(" L1 : "+L1+" L2 :"+L2+" R1 :"+R1+" R2 :"+R2);
       
        if(  L1>R2 ){
            return helper(a,b,start,mid1-1);
        }else if(L2 > R1){
            return helper(a,b,mid1+1,end);
        }else{
             {
         if((n1+n2) %2!=0){
             return Math.min(R1,R2);
         }else
             return ((double)Math.min(R1,R2) +Math.max(L1,L2))/2;
        }
            
            ///
            
        }
        
        /*   
        
       3  
2 3        5 7 8
        
        */
        
        
    }
    
}