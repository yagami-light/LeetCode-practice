class Solution {
    public int longestConsecutive(int[] nums) {
        Map<Integer,Integer> map=new HashMap();
        int max=0;
        for(int i:nums){
            
            if(!map.containsKey(i)){
                
                int left=map.containsKey(i-1) ? map.get(i-1) : 0;
                int right=map.containsKey(i+1) ? map.get(i+1):0;
                
                int len=left+right+1;
                map.put(i,len);
                max=Math.max(max,len);
                map.put(i-left,len);
                map.put(i+right,len);
            }
            
            
        }
        
        
        return max;
    }
}