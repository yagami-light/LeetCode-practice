class Solution {
    public int titleToNumber(String columnTitle) {
        int size=columnTitle.length();
        int res=0;
        int mul=1;
        for(int i=0;i<size;i++){
            
            char ch=columnTitle.charAt(i);
            // System.out.println(" print char :"+ch);
            
            int value=ch-'A'+1;
            
           res=res*26+value;
            // System.out.println(" print value :"+value);
            // System.out.println(" sum value :"+res);

            
            
            
        }
        
        
        return res;
    }
}