class Solution {
    public List<String> letterCasePermutation(String s) {
        List<String> result=new ArrayList();
        
        
        char[] array=s.toCharArray();
        StringBuilder str=null;
        backTrack(array,0, str, result);
        
        return result.stream().distinct().collect(Collectors.toList());
        
    }
    
    
    private void backTrack(char[] array,int index,StringBuilder str,List<String> result){
        
        if(index==array.length){
            result.add(new String(array));
            return;
        }
        backTrack(array,index+1,str,result);
        
        for(int i=index;i<array.length;i++){
            
            if(Character.isLetter(array[i])){
                
                char c=array[i];
                array[i]=Character.isLowerCase(array[i]) ? Character.toUpperCase(array[i]) : Character.toLowerCase(array[i]);
                backTrack(array,i+1,str,result);
                array[i]=c;
                
            }
            
                
              
            
            
        
        
    }
    }
}