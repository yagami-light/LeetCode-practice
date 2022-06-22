class Solution {
    public List<List<Integer>> combine(int n, int k) {
        if(k==0 || n==k){
            List<Integer> list=new LinkedList();
            for(int i=1;i<=k;i++)
                list.add(i);
            
            
            return new LinkedList(Arrays.asList(list));
        }
        
        List<List<Integer>> res=combine(n-1,k-1);
        res.forEach(i->i.add(n));
        res.addAll(combine(n-1,k));
        return res;
        
        
        
    }
}