class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
     
        
        
        return spiralOrderUtil(matrix);
    }
    
    
    private List<Integer> spiralOrderUtil(int[][] mat){
        List<Integer> result=new ArrayList();
        int m=mat.length;
        int n=mat[0].length;
        int dir=0;
        int top=0;
        int left=0;
        int right=n-1;
        int down=m-1;
        
        while(left<=right && top<=down){
            if(dir==0){
                
                for(int i=left;i<=right;i++){
                    result.add(mat[top][i]);
                    
                }
                top++;
                
                
            }
            else if(dir==1){
                
                  for(int i=top;i<=down;i++){
                    
                      result.add(mat[i][right]);
                      
                }
                right--;
                
            }
            else if(dir==2){
                
                  for(int i=right;i>=left;i--){
                    
                      result.add(mat[down][i]);
                }
                down--;
                
            }
            else if(dir==3){
                  for(int i=down;i>=top;i--){
                    result.add(mat[i][left]);
                }
                
                left++;
            }
            dir=(dir+1)%4;
        }
        
        return result;
        
        
        
    }
    
    
}