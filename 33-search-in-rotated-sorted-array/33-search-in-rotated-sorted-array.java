class Solution {
    public int search(int[] nums, int target) {
        int index=0;
        for(int n:nums){
            if(n==target)
                return index;
            index++;
        }
        return -1;
        
    }
}