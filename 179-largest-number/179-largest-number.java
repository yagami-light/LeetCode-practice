class Solution {
    public String largestNumber(int[] nums) {
        int n=nums.length;
        String[] input=new String[n];
        for(int i=0;i<n;i++){
            input[i]= String.valueOf(nums[i]);
        }
        
        
        Arrays.sort(input,(b,a)->(a+b).compareTo(b+a));
        System.out.println("print arrya :"+Arrays.toString(input));
        if(input[0].charAt(0)=='0') return "0";
        
        return Arrays.stream(input).collect(Collectors.joining(""));
    }
}