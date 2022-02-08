class Solution {
    public int lengthOfLongestSubstring(String s) {
        Queue<Character> queue=new LinkedList();
        int max=0;
        for(int i=0;i<s.length();i++){
            
           while(queue.contains(s.charAt(i)))
               queue.remove();
            
            queue.add(s.charAt(i));
            
            max=Math.max(max,queue.size());
            
            
        }
        
        return max;
        
        
    }
}