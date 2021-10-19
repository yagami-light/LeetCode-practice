class Solution {
    public int characterReplacement(String s, int k) {
        int length=s.length();
        int maxCount=0;
        int maxLength=0;
        int[] countArray=new int[26];
        int start=0;
        
        for(int end=0;end<length;end++){
            int index=s.charAt(end)-'A';
            countArray[index]++;
            int count=countArray[index];
            maxCount=Math.max(maxCount,count);
            
            
            while((end-start-maxCount+1) > k){
                countArray[s.charAt(start)-'A']--;
                start++;
               
                
            }
            System.out.println("end "+end +" start "+start);
            maxLength=Math.max(maxLength,end-start+1);
            
            
        }
        
        return maxLength;
        
    }
}