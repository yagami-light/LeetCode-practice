class Solution {
    public boolean canFinish(int n, int[][] pre) {
        
        int[] indegree=new int[n];
        
        ArrayList<Integer>[] graph=new ArrayList[n];
        
        for(int i=0;i<n;i++){
            graph[i]=new ArrayList();
        }
        
        for(int i=0;i<pre.length;i++){
            
            int prec=pre[i][1];
            int curr=pre[i][0];
            
            indegree[prec]++;
            graph[curr].add(prec);
            
            
            
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
            for(int num:graph[j])
                indegree[num]--;
            
            
        }
        return true;
        
        
        
        
    }
}