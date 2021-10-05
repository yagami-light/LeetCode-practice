class Solution {
    public List<String> letterCasePermutation(String s) {
        List<String> list=new ArrayList();
        list.add(s);
        letterCasePermUtil(s,list);
        return list.stream().distinct().collect(Collectors.toList());
        
    }
    
    
    private void letterCasePermUtil(String s,List<String> result){
        int length=s.length();    
        for(int i=0;i<length;i++){
            
            letterCasePerm(s,i,result);
            
        }
        
        
      //  return result;
        
        
    }
    
    
    private void letterCasePerm(String s,int i,List<String> result){
         System.out.println("input  word "+s);          

        if(i>=s.length())
            return;
        
        else{
            
            String prefix=s.substring(0,i);
            String suffix=s.substring(i+1);
            String newString=prefix+(Character.isLowerCase(s.charAt(i)) ?  Character.toUpperCase(s.charAt(i)) : Character.toLowerCase(s.charAt(i))) +suffix;
            System.out.println("word generted "+newString);          
            result.add(newString);
            letterCasePerm(newString,i+1,result);
            letterCasePerm(s,i+1,result);

                     
            
        }
        
        
        
    }
    
    
}