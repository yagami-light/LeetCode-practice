class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        
        return sprialOrderUtil(matrix);
    }
    
    
    public List<Integer> sprialOrderUtil(int[][] mat){
        int m=mat.length;
        int n=mat[0].length;
        int top=0;
        int down=m-1;
        int left=0;
        int right=n-1;
        int dir=0;
        List<Integer> result=new ArrayList();
       
        while(left<=right && top<=down){
            System.out.println("direction "+dir);
        if(dir==0){
            
            for(int i=left;i<=right;i++){
                System.out.println("dir 0  "+mat[top][i]);
                result.add(mat[top][i]);
               
            }
             top++;
            
            
        }
        else if(dir==1){
             for(int i=top;i<=down;i++){
                System.out.println("dir 1  "+mat[i][right]);

                result.add(mat[i][right]);
                
            }
            right--;
        }
        else if(dir==2){
             for(int i=right;i>=left;i--){
                 System.out.println("dir 2  "+mat[down][i]);
                result.add(mat[down][i]);
               
            }
             down--;
        }
        else if(dir==3){
              for(int i=down;i>=top;i--){
                 System.out.println("dir 3  "+mat[i][left]);
                result.add(mat[i][left]);
              
            }
              left++;
        }
        
        dir=(dir+1)%4;
        
        }
        
        
        return result;
    }
    
}