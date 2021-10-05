class Solution {
    public List<String> letterCasePermutation(String s) {
        List<String> result=new ArrayList();
        char[] array=s.toLowerCase().toCharArray();
        helperUtil(array,0,result);
        
        return result;
        
    }
    
    private void helperUtil(char[] array,int index, List<String> result){
        
        if(index==array.length){
            result.add(new String(array));
            return;
        }
        
        helperUtil(array,index+1,result);
        if(Character.isLetter(array[index])){
            
            array[index]=Character.toUpperCase(array[index]);
            helperUtil(array,index+1,result);
            array[index]=Character.toLowerCase(array[index]);
        }
    }
    
    
}