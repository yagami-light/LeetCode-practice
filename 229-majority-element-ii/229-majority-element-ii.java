class Solution {
    public List<Integer> majorityElement(int[] nums) {
        int n=nums.length;
        int count1=0;
        int curr1=0;
        int curr2=0;
        int count2=0;
        List<Integer> res=new ArrayList();
        for(int i:nums){
            if(curr1==i){
                count1++;
            }
            else if(curr2==i){
                count2++;
            }
            else if(count1==0){
                count1=1;
                curr1=i;
            }
            else if(count2==0){
                count2=1;
                curr2=i;
            }else{
                count1--;
                count2--;
            }
            
            
        }
        System.out.println("curr1 : "+curr1+" curr2 :"+curr2);
        // return Arrays.asList(new Integer[]{curr1,curr2});
        
        count1=0;
        count2=0;
        
        for(int i:nums){
            if(curr1==i){
                count1++;
            }
            else if(curr2==i){
                count2++;
            }
            
        }
        
        if(count1>n/3)
            res.add(curr1);
        if(count2>n/3)
            res.add(curr2);
        
        return res;
        
        
        
        
        
    }
}