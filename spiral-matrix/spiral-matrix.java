class Solution {
    public List<Integer> spiralOrder(int[][] mat) {
        
        return spriralOrderUtil(mat);
    }
    
    
    private List<Integer> spriralOrderUtil(int[][] mat){
        List<Integer> result=new ArrayList();
        int dir=0;
        int up=0;
        int down=mat.length-1;
        int left=0;
        int right=mat[0].length-1;
        
        
        while(left<=right && up<=down){
            
            if(dir==0){
                
                for(int i=left;i<=right;i++){
                    result.add(mat[up][i]);
                }
                up++;
                
                
            }
            else if(dir==1){
                for(int i=up;i<=down;i++){
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
                
                for(int i=down;i>=up;i--){
                    result.add(mat[i][left]);
                }
                left++;
                
            }
            
            dir=(dir+1)%4;
            
            
            
        }
        
        return result;
        
    }
    
}