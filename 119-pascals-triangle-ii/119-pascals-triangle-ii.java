class Solution {
    public List<Integer> getRow(int rowIndex) {
        List<Integer> res=new ArrayList();
                List<Integer> prev=new ArrayList();

        for(int i=0;i<=rowIndex;i++){
            res=new ArrayList();
            for(int j=0;j<=i;j++){
                
               if(j==0||i==j)
                        res.add(1);
                    
                    else 
                        res.add(prev.get(j)+prev.get(j-1));
                    
                
                
            }
            prev=res;
        }
    
        
        return res;
}
}