class Solution {
    public void sortColors(int[] A) {
        
       int end=A.length-1;
        int start=0;
        
      for(int i=start;i<=end;){
          
          if(A[i]==0){
              
              int temp=A[i];
              A[i]=A[start];
              A[start]=temp;
              start++;
              
              i++;
              
          }
          else if(A[i]==2){
              
                int temp=A[i];
              A[i]=A[end];
              A[end]=temp;
              end--;
          }else{
              i++;
          }
          
          
      }
        
        
    }
}