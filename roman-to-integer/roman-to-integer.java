class Solution {
    public int romanToInt(String s) {
        final Map<Character,Integer> mapping=new HashMap();
        mapping.put('I',1);
        mapping.put('V',5);
        mapping.put('X',10);
        mapping.put('L',50);
        mapping.put('C',100);
        mapping.put('D',500);
        mapping.put('M',1000);
        int sum=0;
        int lengthOfString=s.length();
        for(int i=0;i<lengthOfString;i++){
            
            Character currentChar=s.charAt(i);
            if((currentChar=='I' || currentChar=='X' || currentChar=='C' ) && i<lengthOfString -1){
                
                Character nextChar=s.charAt(i+1);
                if(((currentChar=='I' && (nextChar=='V' || nextChar=='X'))) || ((currentChar=='X' && (nextChar=='L' || nextChar=='C'))) || ((currentChar=='C' && (nextChar=='D' || nextChar=='M')))){
                sum+=(mapping.get(nextChar)-mapping.get(currentChar));
                 i++;   
                }
                else
                    sum+=mapping.get(currentChar);
                   
            }else{
                
                sum+=mapping.get(currentChar);
                
                
            }
            
        }
        
        
        return sum;
        
    }
}