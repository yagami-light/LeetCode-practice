class Solution {
    public boolean searchMatrix(int[][] mat, int target) {
        int i=0,j=mat[0].length-1;
        
        
        while( i< mat.length && j>=0){
            
            System.out.println("test");
               if(mat[i][j]==target)
                return true;
            if(mat[i][j]<target)
                i++;
            else
                j--;
         
            
            
            
        }
        return false;
        
        
    }
}