class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> result=new ArrayList();
        int openCount=0,closeCount=0;
        backTrack(n,"",openCount,closeCount,result);
        
        
        return result;
    }
    
    
    private void backTrack(int n,String currentString,int openCount,int closeCount,List<String> result){
        if(openCount>n || closeCount > n)
            return;
        if(closeCount>openCount)
                return;
        if(currentString.length()==2*n){
            result.add(currentString);
            return;
        }
        
        
        //)
        
        backTrack(n,currentString+"(",openCount+1,closeCount,result);

        if(openCount > closeCount){
            
            backTrack(n,currentString+")",openCount,closeCount+1,result);
        }
        
       
        
    }
    
}