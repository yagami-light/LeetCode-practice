class Solution {
    public List<List<Integer>> combinationSum(int[] cand, int target) {
        List<List<Integer>> result=new ArrayList();
        int currentSum=0;
        
        Arrays.sort(cand);
        backTrack(cand, target, currentSum,new ArrayList(),result,0);
        
        return result;
        
    }
    
    private void backTrack(int[] cand,int target,int currentSum,List<Integer> currentList,List<List<Integer>> result,int index){
        // System.out.println("currentSum "+currentSum);
        if(currentSum==target){
            result.add(new ArrayList(currentList));
            return;
        }
        
        if(currentSum>target){
            return;
        }
        
        for(int i=index;i<cand.length;i++){
            
            currentSum+=cand[i];
            currentList.add(cand[i]);
            int temp=cand[i];
            // // cand[i]=0;
            backTrack(cand,target,currentSum,currentList,result,i);
            currentList.remove(currentList.size()-1);
            currentSum-=cand[i];
            // cand[i]=temp;
            
            
        }
        
        
    }
        
    
    
    
    
    
}