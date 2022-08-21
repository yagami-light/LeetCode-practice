class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        
        int m=matrix.length;
        int n=matrix[0].length;
        int i=0,j=n-1;
        while(i<m && j < n){
            if(j<0 || i ==m) return false;
            if(matrix[i][j]==target) return true;
            
            while(j>=0 && i <m && matrix[i][j] > target){
                // // System.out.println("matrix i j "+matrix[i][j]);
                j--;
            }
                        if(j<0 || i ==m) return false;

            // System.out.println("out while : "+matrix[i][j]);
              while(j>=0 && i <m && matrix[i][j] < target){
                // System.out.println("alex matrix i j "+matrix[i][j]);
                i++;
            }
                        if(j<0 || i ==m) return false;

            // System.out.println("alex");
            
        }
        
        
        return false;
        
        
        
    }
}