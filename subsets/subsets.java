class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        
        return subsetUtil(nums);
    }
    
    private List<List<Integer>> subsetUtil(int[] nums){
        List<List<Integer>> result=new ArrayList();
        // result.add(new ArrayList());
        List<Integer> arrayList=Arrays.stream(nums).boxed().collect(Collectors.toList());
        helper(arrayList,0,result);
        
        return result;
        
        
        
    }
    
    
    private void helper(List<Integer> list,int index,List<List<Integer>> result){
        System.out.println("input list "+list);    
        System.out.println("index value "+index);
        if(list.size() ==index){
              List<Integer> updatedList=new ArrayList(list);
             result.add(updatedList);
                return;
            
        }
        
            helper(list,index+1,result);
            Integer element=list.get(index);
            list.remove(index);
            List<Integer> updatedList=new ArrayList(list);
           
            System.out.println("printing list "+updatedList);
            // System.out.println("printing resuolt  "+Collections.deepToString(result));

            helper(list,index,result);
        

            list.add(index,element);
            
        
        
    }
    
    
}