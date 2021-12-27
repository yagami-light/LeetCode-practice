class Solution {
    public String longestCommonPrefix(String[] strs) {
        String prefix="";
        if(strs==null || strs.length == 0)
            return prefix;
        prefix=strs[0];
        int index=1;
        while(index<strs.length){
            
            while(strs[index].indexOf(prefix)!=0)
            prefix=prefix.substring(0,prefix.length()-1);
            index++;
            }
        
        
          return prefix;
        }
        
      
        
        
        
    }
