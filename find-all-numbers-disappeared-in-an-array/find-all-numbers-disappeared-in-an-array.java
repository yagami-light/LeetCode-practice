class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        int n=nums.length;
        int[] array=new int[n+1];
        for(int i=0;i<n;i++){
            
            array[nums[i]-1]++;
        }
        List<Integer> list=new ArrayList();
        for(int i=0;i<array.length-1;i++){
            if(array[i]==0)
                list.add(i+1);
            
        }  
        return list;
    }
}