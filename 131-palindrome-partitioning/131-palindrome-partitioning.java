class Solution {
    public List<List<String>> partition(String s) {
        
        List<List<String>>  res=new ArrayList();
        dfs(s,0,new ArrayList(),res);
        
        return res;
        
        
    }
    
    
    private void dfs(String s,int index,List<String> currList,List<List<String>> res){
        if(index==s.length()){
            res.add(new ArrayList(currList));
            return;
        }else{
            
            for(int i=index;i<s.length();i++){
                
                String str=s.substring(index,i+1);
                if(isPalindrome(str)){
                    currList.add(str);
                    dfs(s,i+1,currList,res);
                    currList.remove(currList.size()-1);   
                    
                }
                
                
            }
            
            
            
        }
    }
    
    private boolean isPalindrome(String str){
        return str.equals(((new StringBuilder(str)).reverse().toString()));
    }
}