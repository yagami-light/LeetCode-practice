class Solution {
    public int[] plusOne(int[] digits) {
        
        int n=digits.length;
        int carry=0;
        
        for(int i=n-1;i>=0;i--){
            if(i==n-1){
                int sum=digits[i]+1+carry;
                carry=sum / 10;
                digits[i]= sum % 10;
            }else{
                 int sum=digits[i]+carry;
                carry=sum / 10;
                digits[i]= sum % 10;
            }
            if(carry==0)
                return digits;
            
                
                
        }
        
        if(carry!=0){
            
            int[] digitsRes=new int[n+1];
            System.arraycopy(digits,0,digitsRes,1,digits.length-1);
            digitsRes[0]=carry;
            
            return digitsRes;
            
        }
        
        return digits;
        
        
        
    }
}