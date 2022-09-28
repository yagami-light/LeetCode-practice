class NumArray {

    int[] prefixSum;
    
    public NumArray(int[] nums) {
        
        prefixSum=new int[nums.length+1];
        int sum=0;
        for(int i=0;i<nums.length;i++){
            prefixSum[i]=sum;
            sum +=nums[i];
        }
        prefixSum[nums.length]=sum;
        
        System.out.println("prefix :"+Arrays.toString(prefixSum));
        System.out.println("original num :"+Arrays.toString(nums));
        
        
        
    }
    
    public int sumRange(int left, int right) {
        
        return prefixSum[right+1]-prefixSum[left];
    }
}

/**
 * Your NumArray object will be instantiated and called as such:
 * NumArray obj = new NumArray(nums);
 * int param_1 = obj.sumRange(left,right);
 */


/*


a1,a2,a3,a4,a5,a6

1-3

A2+A3+A4

PREF(1)=A1
PREFIX(3)=A1+A2+A3


0, a1, a1+a2, a1+a2+a3, a1+a2+a3+a4,a1+a2+a3+a4+A5


*/
