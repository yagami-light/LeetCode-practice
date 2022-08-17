class Solution {
    public boolean containsNearbyAlmostDuplicate(int[] nums, int k, int t) {
        TreeSet<Long> set=new TreeSet();
        
        for(int i=0;i<nums.length;i++){
            /*numsi-numj <=t
            numsi<=t+numsj
            numj-numsi<=t
            numsj-t<=numsi
            */
             if(i>k){
                set.remove((long)nums[i-k-1]);
            }
            
            Long floor=set.floor((long)((long)nums[i]+t));
            Long ceiling=set.ceiling((long)((long)nums[i]-t));
            if(floor!=null && floor>=nums[i] ||  ceiling!=null && ceiling<=nums[i]) return true;
            
           
            
            
            set.add(1L*(nums[i]));
            
            
            
        }
        return false;
        
    }
}