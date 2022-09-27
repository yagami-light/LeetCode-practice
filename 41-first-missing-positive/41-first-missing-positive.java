class Solution {
    public int firstMissingPositive(int[] nums) {
        Arrays.sort(nums);
        for(int i=1;i<=nums.length+1;i++){
            
            if(Arrays.binarySearch(nums,i)<0) return i;
            
        }
        return -1;
        
        
    }
}