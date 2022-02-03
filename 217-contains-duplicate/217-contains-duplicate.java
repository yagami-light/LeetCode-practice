class Solution {
    public boolean containsDuplicate(int[] nums) {
       Set<Integer> set=Arrays.stream(nums).boxed().collect(Collectors.toSet());
        System.out.println(set);
        System.out.println(nums.length);
        System.out.println(set.size());
        return !(nums.length == set.size());
        
    }
}