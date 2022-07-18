class Solution {
            Map<String,Integer> map=new HashMap();

    public int numDistinct(String s, String t) {
        
        return helper(s,t,0,0);
    }
    
    
    private int helper(String s,String t,int i,int j){
        
        if(j==t.length()) return 1;
        if(i==s.length()) return 0;
        int sum=0;
        String key=i+"@"+j;
        if(map.containsKey(key))
            return map.get(key);
        if(s.charAt(i)==t.charAt(j)){
            sum+=helper(s,t,i+1,j+1);
            
            sum+=helper(s,t,i+1,j);
        }
        else
            sum+=helper(s,t,i+1,j);
        
        map.put(key, sum);
        return sum;
        
        
    }
    
}


