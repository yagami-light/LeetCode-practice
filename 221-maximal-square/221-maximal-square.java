class Solution {
    public int maximalSquare(char[][] matrix) {
        int m=matrix.length;
        int n=matrix[0].length;
        int max_ans=0;
        
        for(int i=0;i<m;i++){
            
            for(int j=0;j<n;j++){
                if(matrix[i][j]=='1'){
                boolean flag=true;
                int curr=1;
                
                while(i+curr<m && j+curr<n && flag){
                    
                    for(int k=i;k<=i+curr;k++){
                        
                        if(matrix[k][j+curr]=='0'){
                            flag=false;
                            break;
                        }
                        
                    }
                    if(!flag) break;
                    for(int k=j;k<=j+curr;k++){
                        if(matrix[i+curr][k]=='0'){
                            flag=false;
                            break;
                        }
                        
                    }
                    if(!flag) break;
                
                    
                    
                   curr++; 
                }
                
                max_ans=Math.max(max_ans,curr);
                
                
                
                
            }
            
        }
        }
        
        return max_ans*max_ans;
    }
}