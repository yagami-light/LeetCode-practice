class Solution {
    public int maximalRectangle(char[][] matrix) {
        int numRow=matrix.length;
        int numCol=matrix[0].length;
        
        int[][] width=new int[numRow][numCol];
        int area=0;
        for(int row=0;row<numRow;row++){
            
            for(int col=0;col<numCol;col++){
                
                if(matrix[row][col]=='0') width[row][col]=0;
                else{
                    
                    if(col==0) width[row][col]=1;
                    else{
                        
                        width[row][col]=1+width[row][col-1];
                        
                    }
                }
                
                int minWidth=width[row][col];
                
                for(int up_row=row;up_row>=0;up_row--){
                    
                    int height=row-up_row+1;
                    minWidth=Math.min(minWidth,width[up_row][col]);
                    area=Math.max(area,height*minWidth);
                    
                }
                
                
            }
            
        }
        
        return area;
        
        
    }
}