class Solution {
    public boolean search(int[] nums, int target) {
        return Arrays.stream(nums).anyMatch(e->e==target);
    }
}