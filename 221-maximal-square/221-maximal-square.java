class Solution {
    Map<String,Integer> map=new HashMap();
    public int maximalSquare(char[][] matrix) {
        if(matrix.length==0) return 0;
        int m=matrix.length;
        int n=matrix[0].length;
        int max_res=0;
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(matrix[i][j]=='1')
                max_res=Math.max(max_res,helper(matrix,i,j));
            }
        }
        return max_res*max_res;
        
    }
    
    private int helper(char[][] matrix,int i,int j){
        if(i<0 || j<0 ||i>=matrix.length || j>=matrix[0].length) return 0;
        
        if(matrix[i][j]=='0') return 0;
        String key=i+"@"+j;
        if(map.containsKey(key)) return map.get(key);
        int res= Math.min(Math.min(helper(matrix,i+1,j),helper(matrix,i,j+1)),helper(matrix,i+1,j+1))+1;
        map.put(key,res);
        return res;
    }
    
}