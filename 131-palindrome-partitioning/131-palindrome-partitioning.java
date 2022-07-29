class Solution {
    public List<List<String>> partition(String s) {
       List<List<String>> res=new ArrayList();
        helper(s,0,new ArrayList(),res);
        
        return res;
    }
    
    private void helper(String s,int i,List<String> currList,List<List<String>> res){
        if(i>=s.length()){
            res.add(new ArrayList(currList));
        }
        
        for(int j=i;j<s.length();j++){
            if(isPalindrom(s.substring(i,j+1))){
                currList.add(s.substring(i,j+1));
                  helper(s,j+1,currList,res);
                currList.remove(currList.size()-1);
                
            }
          
        }
        
        
        
        
    }
    
    
    
    private boolean isPalindrom(String str){
        return str.equals((new StringBuilder(str)).reverse().toString());
    }
    
}