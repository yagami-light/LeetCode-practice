class Solution {
    public List<List<Integer>> combinationSum2(int[] cand, int target) {
        
         List<List<Integer>> res=new ArrayList();
        Arrays.sort(cand);
        
        combSumUtil(cand, target,new ArrayList(),res,0);
        return res;
        
    }
    
    private void combSumUtil(int[] cand,int target,List<Integer> currList,List<List<Integer>> res,int index){
        if(target==0){
            res.add(new ArrayList(currList));
        }else if(target<0)
        return;
        else{
            
            for(int i=index;i<cand.length;i++){
                if(i>index && cand[i]==cand[i-1]) continue;
                currList.add(cand[i]);
                combSumUtil(cand,target-cand[i],currList,res,i+1);
                currList.remove(currList.size()-1);
            }
            
            
        }
    }
    
    private List<List<Integer>>  removeDuplicate(List<List<Integer>>  inputList){
        List<List<Integer>> res=new ArrayList();
        Map<String,String> map=new HashMap();
        for(List list: inputList){
            String str="";
            Collections.sort(list);
            for(int i=0;i<list.size()-1;i++){
                str+=list.get(i)+",";
            }
            str+=list.get(list.size()-1);
        
        
        map.put(str,"");
        }
        for(String str:map.keySet()){
            List<Integer> list=new ArrayList();
            String[] splitedStr=str.split(",");
            for(String strr:splitedStr){
                list.add(Integer.parseInt(strr));
            }
            res.add(list);
        }
        return res;
        
        
        
    }
    
    
    
}