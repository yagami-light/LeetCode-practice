class Solution {
    public int countCharacters(String[] words, String chars) {
        
        int res=0;
        
        for(String word: words){
            if(isWordGood(word,chars)){
                System.out.println(word);
                res+=word.length();
            }
        }
        
        return res;
        
    }
    
    private boolean isWordGood(String word,String chars){
        
        int[] freq=new int[26];
        int n=Math.max(word.length(),chars.length());
        for(int i=0;i<n;i++){
            
            if(i<chars.length())
            freq[chars.charAt(i)-'a']++;
            if(i<word.length())
            freq[word.charAt(i)-'a']--;
            
            
        }
        // System.out.println(Arrays.toString(freq));
        
        return !Arrays.stream(freq).anyMatch(a->a<0);
        
        
        
    }
    
    
}