class Solution {
    public List<List<Integer>> combinationSum2(int[] cand, int target) {
     
        List<List<Integer>> result=new ArrayList();
        
        Arrays.sort(cand);
        boolean[] found=new boolean[cand.length];
        backTrack(cand,0,new ArrayList(),result,target,found);
        
        return result;
        
        
    }
    
    
    private void backTrack(int[] cand,int index,List<Integer> tempList,List<List<Integer>> result,int target,boolean[] found){
        if(target==0){
            result.add(new ArrayList(tempList));
            return;
            
        }
        if(target<0)
            return;
        
        
        for(int i=index;i<cand.length;i++){
            if(i>index && cand[i]==cand[i-1] || found[i]) continue;
            // if(tempList.contains(cand[i])) continue;
            found[i]=true;
            tempList.add(cand[i]);
            backTrack(cand,i+1,tempList,result,target-cand[i],found);
            tempList.remove(tempList.size()-1);
            found[i]=false;
            
        }
        
        
    }
}