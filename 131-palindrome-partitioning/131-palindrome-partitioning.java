class Solution {
    public List<List<String>> partition(String s) {
        List<List<String>>  res=new ArrayList();
        
        List<String> currList=new ArrayList();
        int index=0;
        
        
        helper(s,index,currList,res);
        
        return res;
    }
    private void helper(String str,int index,List<String> currList, List<List<String>> res){
        
        if(index==str.length()){
            
            res.add(new ArrayList(currList));
            return;
            
            
        }
        
        for(int i=index;i<str.length();i++){
            
            String substr=str.substring(index,i+1);
            if(isPalindrome(substr)){
                
                currList.add(substr);
                
                helper(str,i+1,currList,res);
                currList.remove(currList.size()-1);
                
                
                
            }
            
            
            
        }
        
        
        
        
    }
    
    private boolean isPalindrome(String str){
        
        return str.equals(new StringBuilder(str).reverse().toString());
        
    }
    
    
    
}