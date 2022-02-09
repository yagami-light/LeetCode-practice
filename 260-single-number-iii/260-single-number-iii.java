class Solution {
    public int[] singleNumber(int[] nums) {
        
        Map<Integer,Integer> map=new HashMap();
        
        for(int n:nums)
            map.merge(n,1,Integer::sum);
        
        int[] res=new int[2];
        int count=0;
        for(int n:map.keySet()){
            
            if(map.get(n)==1)
                res[count++]=n;
            
        }
        
        return res;
        
        
    }
}


