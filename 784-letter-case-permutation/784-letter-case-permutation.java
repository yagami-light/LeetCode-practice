class Solution {
    public List<String> letterCasePermutation(String s) {
        List<String> res=new ArrayList();
        char[] input=s.toCharArray();
        int index=0;
        helper(input,index,res);
        
        return res;
        
        
    }
    
    private void helper(char[] input,int index,List<String> res){
        if(index==input.length){
            res.add(new String(input));
            return;
        }
        
        helper(input,index+1,res);
        char og=input[index];
        if(Character.isLetter(og)){
        input[index]=Character.isUpperCase(input[index]) ? Character.toLowerCase(og) : Character.toUpperCase(og);
        helper(input,index+1,res);
        input[index]=og;
        }
        
        
        
    }
    
}