class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> result=new ArrayList();
        genParentUtil(n,0,0,"",result);
        
        return result;
        
        
    }
    
    
    private void genParentUtil(int n,int open,int close,String str,List<String> result){
        System.out.println(str);
        if(close> open)
            return;
        
        if(str.length() == 2*n){
            result.add(str.toString());
        }
        if(open<n)
        genParentUtil(n,open+1,close,str+'(',result);
        
        if(open>close)
         genParentUtil(n,open,close+1,str+')',result);
        
        
        
        
        
        
    }
    
    
}