class Solution {
    public int maximalRectangle(char[][] matrix) {
        int row=matrix.length;
        int col=matrix[0].length;
        
        int[][] width=new int[row][col];
        int maxArea=0;
        
        for(int i=0;i<row;i++){
            
            
            for(int j=0;j<col;j++){
                
                if(matrix[i][j]=='0') width[i][j]=0;
                else{
                    
                    if(j==0) width[i][j]=1;
                    else
                        width[i][j]=1+width[i][j-1];
                    
                                     
                 // System.out.print(width[i][j]+" ");   
                int minWidth=width[i][j];
                    
                    
                for(int up_row=i;up_row>=0;up_row--){
                    
                    int height=i-up_row+1;
                    minWidth=Math.min(minWidth,width[up_row][j]);
                    // System.out.println(" height is :"+height+" and minWidth is :"+minWidth);
                    maxArea=Math.max(maxArea,height*minWidth);
                    
                }
                    
                }
                
                
                
            }
            // System.out.println();
            
        }
        System.out.println(Arrays.deepToString(width));
        return maxArea;
        
        
    }
}