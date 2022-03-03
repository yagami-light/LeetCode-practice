class Solution {
    public boolean canFinish(int n, int[][] pre) {
        
        ArrayList<Integer>[] graph=new ArrayList[n];
        int[] indegree=new int[n];
        for(int i=0;i<n;i++){
            graph[i]=new ArrayList();
        }
        
        for(int i=0;i<pre.length;i++){
            graph[pre[i][0]].add(pre[i][1]);
            indegree[pre[i][1]]++;
        }
        
        for(int i=0;i<n;i++){
            int j=0;
            for(;j<n;j++){
                
                if(indegree[j]==0)
                    break;
            }
                if(j==n)
                    return false;
                
                indegree[j]=-1;
                
                for(int num:graph[j]){
                    indegree[num]--;
                }
                
                
            
            
        }
        
        
        return true;
        
        
        
       
        
        
    }
}