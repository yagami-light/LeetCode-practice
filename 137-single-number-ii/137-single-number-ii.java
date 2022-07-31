class Solution {
    public int singleNumber(int[] nums) {
        Arrays.sort(nums);
        System.out.println("print arrayu :"+Arrays.toString(nums));
        int n=nums.length;
        for(int i=0;i<n-2;){
            System.out.println("nums i"+nums[i]+" nums i+2 :"+nums[i+2]);
            if(nums[i]!=nums[i+2]) return nums[i];
            i=i+3;
        }
        
        return nums[n-1];
    }
}