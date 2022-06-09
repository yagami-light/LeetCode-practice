class Solution {
    public List<List<Integer>> combinationSum(int[] cand, int target) {
        List<List<List<Integer>>> res=new ArrayList();
        
        for(int i=0;i<=target;i++){
            res.add(i,new ArrayList());
        }
        
        for(int i=0;i<cand.length;i++){
            
            for(int sum=cand[i];sum<=target;sum++){
                
                List<List<Integer>> sum_list=res.get(sum);
                List<List<Integer>> sub_list=res.get(sum-cand[i]);
                
                if(sum==cand[i]){
                    List<Integer> templist=new ArrayList();
                    templist.add(cand[i]);
                    sum_list.add(templist);
                }
                
                
          /*      
                if(sub_list.size()>0){
                    
                    for(int j=0;j<sub_list.size();j++){
                        List<Integer> list=new ArrayList(sub_list.get(j));
                        list.add(cand[j]);
                        sum_list.add(list);
                        
                    }
                    
                }
                
            */
                
                if (sub_list.size() > 0) {
                for (int j = 0; j < sub_list.size(); j++) {
                    ArrayList<Integer> temp = new ArrayList<Integer>(sub_list.get(j));
                    temp.add(cand[i]);
                    sum_list.add(temp);
                }
            }
            }
        }
        
        return res.get(target);
        
        
        
        
        
    }
}