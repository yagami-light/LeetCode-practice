class Solution {
    public boolean find132pattern(int[] nums) {
        
        int n=nums.length;
       
        
        int[] minElement=new int[n];
         minElement[0]=Integer.MAX_VALUE;
        for(int i=1;i<n;i++){
            System.out.println("minElement :"+minElement[i-1]+" nums[i-1] :"+nums[i-1]);
            minElement[i]=Math.min(minElement[i-1],nums[i-1]);
            
        }
        
       /*
        [1,2,3,4]
        [max,1,1]
        
        */
        TreeSet<Integer> treeSet=new TreeSet();
        // System.out.println("print min array : "+Arrays.toString(minElement));
        
        for(int i=n-1;i>=0;i--){
            
            int num=nums[i];
            int minLeft=minElement[i];
            // System.out.println("treeSet :"+treeSet);
            Integer rightHigherNum=treeSet.lower(num);
            // System.out.println("rightHigherNum :"+rightHigherNum);
            // System.out.println("print num:"+num);

            if(rightHigherNum!=null && minLeft<rightHigherNum && rightHigherNum < num) return true;
            
            
            treeSet.add(num);
            
            
            
        }
        
        return false;
        
        
        
    }
}