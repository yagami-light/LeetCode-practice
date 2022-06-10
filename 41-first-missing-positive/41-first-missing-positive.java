class Solution {
    public int firstMissingPositive(int[] nums) {
        Set<Integer> set=Arrays.stream(nums).boxed().collect(Collectors.toSet());
        // System.out.println(set);
        // Arrays.sort(nums);
        for(int i=1;i<=nums.length+1;i++){
            // System.out.println("i"+i);
            // System.out.println(Arrays.binarySearch(nums,i));
            if(!set.contains(i))
                return i;
            
        }
        return -1;
    }
}