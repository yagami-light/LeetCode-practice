class Solution {
    public int romanToInt(String s) {
        
        Map<Character,Integer> map=new HashMap();
        map.put('I',1);
        map.put('V',5);
        map.put('X',10);
        map.put('L',50);
        map.put('C',100);
        map.put('D',500);
        map.put('M',1000);
        int sum=0;
        
        int len=s.length();
        
        for(int i=0;i<len;i++){
            
            char currDigit=s.charAt(i);
            int currValue=map.get(currDigit);
            
            if((currDigit=='I'|| currDigit=='X' || currDigit=='C' ) && i<len-1 ){
                
                char nextDigit=s.charAt(i+1);
                if((currDigit=='I' && (nextDigit=='V' || nextDigit=='X')) ||
                   (currDigit=='X' && (nextDigit=='L' || nextDigit=='C')) ||
                   (currDigit=='C' && (nextDigit=='D' || nextDigit=='M')) ){
                int nextValue=map.get(nextDigit);
                currValue=nextValue-currValue;
                i+=1;    
                }
                
                
            }
            
            sum+=currValue;
            
            
            
            
            
            
        }
        
        
        return sum;
        
        
        
        
    }
}