class Solution {
    public List<Integer> majorityElement(int[] nums) {
        Map<Integer,Integer> map=new HashMap();
        int minCount=nums.length/3;
        Set<Integer> res=new HashSet();
        for(int i:nums){
            
            map.put(i,map.getOrDefault(i,0)+1);
            if(map.get(i)>minCount)
                res.add(i);
            
        }
        
        return new ArrayList(res);
        
    }
}