class Solution {
    public int minPathSum(int[][] grid) {
        int m=grid.length;
        int n=grid[0].length;
        
        int[] row=new int[n];
        
        for(int i=0;i<m;i++){
            
            int[] newRow=new int[n];
            for(int j=0;j<n;j++){
                
                if(j==0 && i==0){
                    newRow[j]=grid[i][j];
                }
                else if(i==0)
                    newRow[j]=grid[i][j]+newRow[j-1];
                else if(j==0)
                    newRow[j]=grid[i][j]+row[j];
                else {
                    // System.out.println("prev min "+newRow[j-1]+" and row is "+row[i-1]);
                    newRow[j]=grid[i][j]+Math.min(newRow[j-1],row[j]);
                }
                
                
            }
            System.out.println("newRow print "+Arrays.toString(newRow));
            row=newRow;
            
        }
        
        return row[n-1];
        
        
        
    }
}