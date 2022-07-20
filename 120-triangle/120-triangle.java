class Solution {
    /*
    
    [
    [-1],
    [3,2],
    [-3,1,-1]]
    
    
    
    */
    Map<String,Integer> map=new HashMap();
    
    public int minimumTotal(List<List<Integer>> triangle) {
        
        return helper(triangle,0,0);
    }
    
    private int helper(List<List<Integer>> triangle,int level,int j){
        String key=level+"@"+j ;
        if(map.containsKey(key))
            return map.get(key);
        if(j>=triangle.size() || j<0)
                return Integer.MAX_VALUE;
        
        if(level==triangle.size()-1){
            // System.out.println("leaf node :"+triangle.get(level).get(j));
            return triangle.get(level).get(j);
        }
        else{
              
            int currVal=triangle.get(level).get(j);
            // System.out.println("curr Value :"+currVal);
            int res= currVal+ Math.min(Math.min(helper(triangle,level+1,j),helper(triangle,level+1,j)),helper(triangle,level+1,j+1));
            map.put(key,res);
            return res;
        }
        
        
        
    }
    
}