class Solution {
    public List<List<Integer>> combinationSum2(int[] cand, int target) {
        
        List<List<Integer>> result=new ArrayList();
        int currentSum=0;
        boolean[] checked=new boolean[cand.length];
        Arrays.sort(cand);
        System.out.println("prinitng array "+Arrays.toString(cand));
        backTrack(cand,target,currentSum,new ArrayList(),result,0,checked);
        
        return result;
        
    }
    
    
    
    private void backTrack(int[] cand,int target, int currentSum,List<Integer> currentList,List<List<Integer>> result,int index,boolean[] checked){
        
        if(currentSum==target){
            result.add(new ArrayList(currentList));
            return;
        }
        
        if(currentSum>target){
            return;
        }
        
        for(int i=index;i<cand.length;i++){
            if(checked[i]) continue;
            if(i>index && cand[i]==cand[i-1] && !checked[i-1]) continue;
            currentSum+=cand[i];
            currentList.add(cand[i]);
            checked[i]=true;
            backTrack(cand,target,currentSum,currentList,result,i+1,checked);
            checked[i]=false;
            currentList.remove(currentList.size()-1);
            currentSum-=cand[i];
            
        }
        
        
    }
}