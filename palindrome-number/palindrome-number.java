class Solution {
    public boolean isPalindrome(int x) {
        
        System.out.println((new StringBuilder(x+"").reverse().toString()));
        System.out.println(x+"");
        return new String(new StringBuilder(x+"").reverse()).equals(x+"");
        
        
    }
}