class Solution {
    public int kthSmallest(int[][] matrix, int k) {
        
        PriorityQueue<int[]> pq=new PriorityQueue<int[]>(k,(a,b)->Integer.compare(a[0],b[0]));
        int m=matrix.length;
        //num,row,col
        int ans=-1;
        
        for(int i=0;i<matrix.length;i++){
            
            int[] node=new int[]{matrix[i][0],i,0};
            pq.add(node);
            
        }
        
        for(int i=1;i<k;i++){
            int[] node=pq.remove();
            int num=node[0];
            int row=node[1];
            int col=node[2];
            ans=num;
            if(col+1<matrix[row].length){
                pq.add(new int[] {
                    matrix[row][col+1],row,col+1
                });
            }
        }
        
        return pq.remove()[0];
        
        
    }
}