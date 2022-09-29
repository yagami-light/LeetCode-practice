class Solution {
    public List<String> letterCombinations(String digits) {
        Map<Character,String> map=new HashMap();
        map.put('2',"abc");
        map.put('3',"def");
        map.put('4',"ghi");
        map.put('5',"jkl");
        map.put('6',"mno");
        map.put('7',"pqrs");
        map.put('8',"tuv");
        map.put('9',"wxyz");
        
        
         List<String> res=new ArrayList();
        if(digits.isEmpty()) return res;
        String currString="";
        int index=0;
        helper(digits,currString,index,res,map);
        
        return res;
        
    }
    
    private void helper(String digits,String currString,int index, List<String> res, Map<Character,String> map){
        if(index==digits.length()){
            
            res.add(currString);
            return;
            
        }
                if(index >= digits.length()) return;

        // System.out.println("currString :"+currString);
        
        String possibleLetters=map.get(digits.charAt(index));
        
        for(char ch:possibleLetters.toCharArray()){
            System.out.println("ch is L "+ch);
            helper(digits,currString+ch,index+1,res,map);
            
            
        }
        
        
    }
    
}