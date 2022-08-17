class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        Set<Integer> set=new HashSet();
        
        for(int i=0;i<nums.length;i++){
            // System.out.println("number is :"+nums[i]);
            // System.out.println("set is first :"+set);
            if(i>k)  set.remove(nums[i-k-1]);
            // System.out.println("set is second :"+set);
            if(!set.add(nums[i])) return true;
            
        }
        return false;
        
    }
    
    public boolean containsNearbyDuplicate1(int[] nums, int k) {
        Set<Integer> set = new HashSet<Integer>();
        for(int i = 0; i < nums.length; i++){
            if(i > k) set.remove(nums[i-k-1]);
            if(!set.add(nums[i])) return true;
        }
        return false;
 }
    
}

/*

i-j <=k
i<=j+k

*/