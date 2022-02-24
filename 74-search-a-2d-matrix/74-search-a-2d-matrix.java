class Solution {
    public boolean searchMatrix(int[][] mat, int target) {
     
        /*
        00 01 02 03
        10 11 12 13
        20 21 22 23
        30 31 33 33
            
        0 1 2 3
        4 5 6 7
        8 9 10 11
       12 13 14 15
            
            
        index = i*rowLength+j    
            
        i=index/rowLength, j=index%rowlength
        
        
        */
        
        
        int rowLen=mat[0].length;
        int colLen=mat.length;
        
        
        
        return searchMatUtil(mat,0,(rowLen*colLen)-1,target,rowLen,colLen);
        
        
        
    }
    
    private boolean searchMatUtil(int[][] mat,int start, int end, int target,int rowLen,int colLen){
        
        
        if(start>end)
            return false;
        
        int mid=(start+end)/2;
        
        
        
        if(mat[mid/rowLen][mid%rowLen]==target)
            return true;
        
       if(mat[mid/rowLen][mid%rowLen] <target)
          return searchMatUtil(mat,mid+1,end,target,rowLen,colLen);
           else 
               
           return    searchMatUtil(mat,start,mid-1,target,rowLen,colLen);
               
            
        
        
        
    }
    
    
}