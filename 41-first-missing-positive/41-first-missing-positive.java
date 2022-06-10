class Solution {
    public int firstMissingPositive(int[] nums) {
        
        for(int i=0;i<nums.length;i++){
            // System.out.println(Arrays.toString(nums));
            int curr=nums[i];
            while(curr-1>=0 && curr-1<nums.length && nums[curr-1]!=curr){
                // System.out.println("element at "+i+" "+nums[i]);
                int next = nums[curr-1];
                nums[curr-1] = curr;
                curr = next;
                
            }
        }
        
        for(int i=0;i<nums.length;i++){
            if(nums[i]!=i+1)
                return i+1;
        }
        
        return nums.length+1;
        
        
        
        
    }
}