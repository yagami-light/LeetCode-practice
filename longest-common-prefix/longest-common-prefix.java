class Solution {
    public String longestCommonPrefix(String[] strs) {
        if(strs.length==0)
            return "";
        if(strs.length==1)
            return strs[0];
        
        String firstString=strs[0];
        String prefix="";
        boolean isMatched=false;
      
        OuterLoop:
        for(int index=0;index<firstString.length();index++){
            isMatched=false;
            for(int i=1;i<strs.length;i++){
             
                if( index >=(strs[i].length()) || ((index<strs[i].length()) && (firstString.charAt(index)!=strs[i].charAt(index)))){
                    isMatched=false;
                    break OuterLoop;
                    
                }
                else
                    isMatched=true;
            
            }
            System.out.println("index "+index);
            if(isMatched)
            prefix+=firstString.charAt(index);
            
            
        }
        
        return prefix;
        
        
        
        
    }
}