class Solution {
    public List<List<Integer>> combine(int n, int k) {
        // int[] input=IntStream.range(1,n+1).toArray();
        List<List<Integer>> result=new ArrayList();
        int input=n;
        // Arrays.sort(input);
        backTrack(input,1,new ArrayList(),result,k);
        
        return result; //.stream().distinct().collect(Collectors.toList());
    }
    
 
    private void backTrack(int n,int num,List<Integer> currentList,List<List<Integer>> result,int k){
        
        if(currentList.size()==k){
            result.add(new ArrayList(currentList));
            return;
        }
        
        
        for(int i=num;i<=n;i++){
            // if(currentList.contains(i)) continue;
            currentList.add(i);
            backTrack(n,i+1,currentList,result,k);
            currentList.remove(currentList.size()-1);
            
            
            
        }
        
        
    }
    
    
 
    
   
}