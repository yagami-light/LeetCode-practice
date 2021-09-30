class NumArray {
    
        int[] prefix;
    

    public NumArray(int[] nums) {
        int size=nums.length;
        prefix=new int[size+1];
        int sum=0;
        for(int i=0;i<size;i++){
            prefix[i]=sum;
            sum+=nums[i];
           
        }
        prefix[size]=sum;
    }
    
    public int sumRange(int left, int right) {
        // System.out.println("prefix array "+Arrays.toString(prefix));
        
        return prefix[right+1]-prefix[left];
    }
}

/**
 * Your NumArray object will be instantiated and called as such:
 * NumArray obj = new NumArray(nums);
 * int param_1 = obj.sumRange(left,right);
 */