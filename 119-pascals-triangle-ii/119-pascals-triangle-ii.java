class Solution {
    public List<Integer> getRow(int rowIndex) {
        List<Integer> res=new ArrayList();
        int prev=1;
        res.add(1);
        
        for(int i=1;i<=rowIndex;i++){
            
            for(int j=1;j<i;j++){
                int temp=res.get(j);
                res.set(j,prev+res.get(j));
                prev=temp;
            }
            
            res.add(1);
        }
        
        return res;
        
        
    }
}