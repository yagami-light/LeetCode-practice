class Solution {
    public List<List<Integer>> combinationSum3(int k, int n) {
        
        List<List<Integer>> result=new ArrayList();
        int currentSum=0;
        backTrack(k,n,new ArrayList(),currentSum,result,1);
        
        return result;
        
    }
    
    
    
    private void backTrack(int k,int target,List<Integer> currentList,int currentSum,List<List<Integer>> result,int index){
        if(currentSum==target && currentList.size()==k){
            result.add(new ArrayList(currentList));
            return;
            
        }
        
        
        
        for(int i=index;i<=9;i++){
            
            currentList.add(i);
            currentSum+=i;
            
            backTrack(k,target,currentList,currentSum,result,i+1);
            
            currentSum-=i;
            currentList.remove(currentList.size()-1);
            
            
            
        }
        
        
        
    }
}