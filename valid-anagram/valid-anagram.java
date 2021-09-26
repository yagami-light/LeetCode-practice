import java.math.BigInteger;
class Solution {
    public boolean isAnagram(String s, String t) {
        int[] primes=new int[]{2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89, 97, 101, 103, 107, 109, 113};

        BigInteger sumA=new BigInteger("1");
        for(int i=0;i<s.length();i++){
            
            sumA=sumA.multiply(BigInteger.valueOf(primes[s.charAt(i)-'a']));
            
        }
        BigInteger sumB=new BigInteger("1");

        for(int i=0;i<t.length();i++){
            
            sumB=sumB.multiply(BigInteger.valueOf(primes[t.charAt(i)-'a']));
            
        }
        
        
        return sumA.equals(sumB);
    }
}