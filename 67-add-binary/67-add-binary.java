class Solution {
    public String addBinary(String a, String b) {
        
        StringBuilder str=new StringBuilder();
        int i=a.length()-1;
        int j=b.length()-1;
        int carry=0;
        while(i>=0 || j>=0){
            int sum=carry;
            int aInt=(i>=0) ? a.charAt(i--)-'0' : 0;
            int bInt=(j>=0) ? b.charAt(j--)-'0' : 0;
                       
             sum+=aInt+bInt;
            str.append(sum%2);
            carry=sum/2;
            
            
        }
        if(carry!=0)
            str.append(carry);
        
        
        return str.reverse().toString();
        
    }
    
    
    
}