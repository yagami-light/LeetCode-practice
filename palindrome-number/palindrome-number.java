class Solution {
    public boolean isPalindrome(int x) {
        
        String strInt=new String(x+"");
        return strInt.equals((new StringBuilder(strInt)).reverse().toString());
        
    }
}