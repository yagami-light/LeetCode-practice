class Solution {
    public int singleNumber(int[] nums) {
        Map<Integer,Integer> map=new HashMap();
        for(int i:nums)
            map.merge(i,1,Integer::sum);
        
        for(int i:map.keySet()){
            if(map.get(i)==1) return i;
        }
        return -1;
    }
}