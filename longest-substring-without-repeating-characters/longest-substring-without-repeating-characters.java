class Solution {
    public int lengthOfLongestSubstring(String s) {
        
        char[] stringArray=s.toCharArray();
        int start=0;
        int end=0;
        // int[] map=new int[26];
        int n=s.length();
        int maxLength=Integer.MIN_VALUE;
        Set<Character> set =new HashSet();

        end=start;
        while(end<n){
            char c=stringArray[end];
            // System.out.println("char c"+c+" end "+end);
            // System.out.println("set "+set);
            if(!set.contains(c)){
                maxLength=Math.max(maxLength,end-start+1);
                set.add(c);
                 end++;
            }else{
                start++;
                end=start;
                set.clear();

            }
            
        }
            return maxLength==Integer.MIN_VALUE ? 0 : maxLength;   
    }
}