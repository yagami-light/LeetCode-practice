class Solution {
    public int[] findOrder(int n, int[][] pre) {
          int[] indegree=new int[n];
        
        ArrayList<Integer>[] graph=new ArrayList[n];
        for(int i=0;i<n;i++) graph[i]=new ArrayList();
        for(int i=0;i<pre.length;i++){
            
            int curr=pre[i][0];
            int prec=pre[i][1];
            
            indegree[prec]++;
            graph[curr].add(prec);
            
        }
        System.out.println(Arrays.toString(indegree));
        int index=n;
        int count=n-1;
        
                int[] res=new int[n];

        Queue<Integer> queue=new LinkedList();
        for(int i=0;i<n;i++){
            if(indegree[i]==0){
                queue.add(i);
               
            }
        }
        while(!queue.isEmpty()){
            int poppedValue=queue.remove();
            res[count--]=poppedValue;
            
            for(int i: graph[poppedValue]){
                
                indegree[i]--;
                if(indegree[i]==0){
                    queue.add(i);
                    // res[count++]=i;

                       
                }
                
            }
            index--;
        }
        // Arrays.sort(res,Collections.reverseOrder());
        return index==0 ? res: new int[0];
        
}
}