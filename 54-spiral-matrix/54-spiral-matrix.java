class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        int m=matrix.length;
        int n=matrix[0].length;
         List<Integer> res=new ArrayList();
        int DIR=0;
        int top=0, down=m-1, left=0, right=n-1;
        
        while(top<=down && left <= right){
            
            if(DIR==0){
            for(int i=left;i<=right;i++){
                
                res.add(matrix[top][i]);
                
                
                
                
            }
            top++;
                
                
            }
            
            if(DIR==1){
                
                 for(int i=top;i<=down;i++){
                
                res.add(matrix[i][right]);
                
                
                
                
            }
            right--;
                
                
                
                
            }
            
            if(DIR==2){
                
                 for(int i=right;i>=left;i--){
                
                res.add(matrix[down][i]);
                
                
                
                
            }
            down--;
                
                
                
            }
            
            if(DIR==3){
                
                 for(int i=down;i>=top;i--){
                
                res.add(matrix[i][left]);
                
                
                
                
            }
            left++;
                
                
                
                
            }
            
            
            DIR=(DIR+1)%4;
            
            
            
            
        }
        
        
        return res;
        
        
        
        
    }
}