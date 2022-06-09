class Solution {
    public List<List<Integer>> combinationSum2(int[] nums, int target) {
    List<List<List<Integer>>> ans = new ArrayList<>();
    Arrays.sort(nums);
    if (nums[0] > target) {
        return new ArrayList<List<Integer>>();
    }
    for (int i = 0; i <= target; i++) {
        List<List<Integer>> ans_i = new ArrayList<List<Integer>>();
        ans.add(i, ans_i);
    }

    for (int i = 0; i < nums.length; i++) {
        /*******************修改的地方********************/
        if (i > 0 && nums[i] == nums[i - 1]) {
            continue;
        }
        /***********************************************/
        for (int sum = nums[i]; sum <= target; sum++) {
            List<List<Integer>> ans_sum = ans.get(sum);
            List<List<Integer>> ans_sub = ans.get(sum - nums[i]);
            if (sum == nums[i]) {
                ArrayList<Integer> temp = new ArrayList<Integer>();
                temp.add(nums[i]);
                ans_sum.add(temp);

            }
            if (ans_sub.size() > 0) {
                for (int j = 0; j < ans_sub.size(); j++) {
                    ArrayList<Integer> temp = new ArrayList<Integer>(ans_sub.get(j));
                    temp.add(nums[i]);
                    ans_sum.add(temp);
                }
            }
        }
    }
    return remove(ans.get(target), nums);

}

private List<List<Integer>> remove(List<List<Integer>> list, int[] nums) {
    HashMap<Integer, Integer> nh = new HashMap<Integer, Integer>();
    List<List<Integer>> ans = new ArrayList<List<Integer>>(list);
    for (int n : nums) {
        int s = nh.getOrDefault(n, 0);
        nh.put(n, s + 1);
    }
    for (int i = 0; i < list.size(); i++) {
        List<Integer> l = list.get(i);
        HashMap<Integer, Integer> temp = new HashMap<Integer, Integer>();
        for (int n : l) {
            int s = temp.getOrDefault(n, 0);
            temp.put(n, s + 1);
        }
        for (int n : l) {
            if (temp.get(n) > nh.get(n)) {
                ans.remove(l);
                break;
            }
        }
    }
    return ans;
}

    
    
}