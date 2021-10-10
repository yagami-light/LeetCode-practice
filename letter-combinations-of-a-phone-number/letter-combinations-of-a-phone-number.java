class Solution {
    public List<String> letterCombinations(String digits) {
        List<String> result=new ArrayList();
        
        Map<Character,String> map=new HashMap();
        map.put('2',"abc");
        map.put('3',"def");
        map.put('4',"ghi");
        map.put('5',"jkl");
        map.put('6',"mno");
        map.put('7',"pqrs");
        map.put('8',"tuv");
        map.put('9',"wxyz");
        if(digits.length()==0)
            return result;
        backTrack(digits,0,"",result,map);    
        return result;
        
    }
    
    
    private void backTrack(String digits,int index,String current,List<String> result,Map<Character,String> map){
        if(current.length()==digits.length()){
            result.add(current);
            return;
            
        }
        
        for(int i=index;i<digits.length();i++){
            
            char c=digits.charAt(i);
            String possibleDigits=map.get(c);
            for(int j=0;j<possibleDigits.length();j++){
                 backTrack(digits,i+1,current+possibleDigits.charAt(j),result,map);
                
            }
           
            
            
            
            
            
        }
        
        
    }
    
}