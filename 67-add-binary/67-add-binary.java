class Solution {
    public String addBinary(String a, String b) {
        int i=a.length()-1;
        int j=b.length()-1;
        int carry=0;
        StringBuilder str=new StringBuilder();
        while(i>=0 || j >=0 ){
            int sum=carry;
            int inta=(i>=0) ? a.charAt(i--)-'0' : 0;
            int intb=(j>=0) ? b.charAt(j--)-'0' : 0;
            
            sum+=inta+intb;
            str.append(sum % 2);
            carry=sum/2;
            
        }
        if(carry!=0)
            str.append(carry);
        
        return str.reverse().toString();
        
    }
}