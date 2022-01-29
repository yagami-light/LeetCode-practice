class Solution {
    public int numTeams(int[] rating) {
        int res=0;
        
        
        for(int i=1;i<rating.length-1;i++){
            int less[]=new int[2];
            int greater[]=new int[2];
            
            for(int j=0;j<rating.length;j++){
                
                if(rating[j]<rating[i]){
                    
                    less[i<j ? 0 : 1 ]++;
                    
                }
                
                 if(rating[j]>rating[i]){
                     greater[i<j ? 0 : 1 ]++;
                }
                
                
            }
            
            res+=(less[0]*greater[1])+(less[1]*greater[0]);
            
            
        }
        
        return res;
        
        
    }
}