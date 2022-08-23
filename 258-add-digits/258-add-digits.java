class Solution {
    public int addDigits(int num) {
        int res=num;
        while(!(res<10)){
            res=helper(res);
        }
        
        return res;
    }
    
    
    
    private int  helper(int nums){
        System.out.println("nums : "+nums);
        int res=0;
        while(nums!=0){
            res += nums%10;
            int no=nums/10;
            // System.out.println("no is :"+no);
            // res+=no;
            nums=no;
            
        }
        
    return res;    
    }
    
    
}