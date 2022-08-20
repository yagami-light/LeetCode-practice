class Solution {
    public List<String> summaryRanges(int[] nums) {
        int n=nums.length;
        List<String>  res=new ArrayList();
        if(n==1) { res.add(""+nums[0]); return res; }
       
        for(int i=0;i<n;i++){
            
            int num=nums[i];
            while(i+1<nums.length && nums[i+1]-nums[i]==1){
                i++;
            }
            if(nums[i]!=num){
                res.add(num+"->"+nums[i]);
                
            }else{
                res.add(nums[i]+"");
            }
            
        }
        
        return res;
    }
}