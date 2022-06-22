class Solution {
    public List<List<Integer>> combine(int n, int k) {
        if(n==0 || k>n || k==0) return  Collections.emptyList();
        // List<Integer> currList=new ArrayList();
        List<List<Integer>> res=new ArrayList();
        for(int i=1;i<=n+1-k;i++)
            res.add(Arrays.asList(i));
        
        
        for(int i=2;i<=k;i++){
             List<List<Integer>> temp=new ArrayList();
            for(List<Integer> list: res){
                
                
               for (int m = list.get(list.size() - 1) + 1; m <= n - (k - (i - 1)) + 1; m++){
                    
                    List<Integer> tempList=new ArrayList(list);
                    tempList.add(m);
                    
                    temp.add(tempList);
                    
                    
                }
                
            }
            
            
            res=temp;
            
            
        }
        
     
        
        
        return res;
     
        
        
        
        
        
        
        
    }
}