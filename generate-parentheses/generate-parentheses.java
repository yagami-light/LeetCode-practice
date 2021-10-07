class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> result=new ArrayList();
        helper(n,"",result,0,0);
        return result;
    }
    
    
    private void helper(int n, String current,List<String> result,int leftCount,int rightCount){
        
        if(current.length()==2*n){
            result.add(current);
        }
        
       
        if(leftCount>rightCount){
            if(leftCount<n)
            helper(n,current+"(",result,leftCount+1,rightCount);
            if(rightCount<n && rightCount<leftCount)
            helper(n,current+")",result,leftCount,rightCount+1);
            
            
        }
        
        if(leftCount<n && leftCount==rightCount){
             helper(n,current+"(",result,leftCount+1,rightCount);
        }
        if(rightCount<leftCount){
            return;
        }
        
        
        
    }
}