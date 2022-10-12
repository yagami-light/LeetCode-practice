//{ Driver Code Starts
//Initial Template for Java

import java.util.*;
class KthSmallestElement{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int t=Integer.parseInt(sc.next());
		while(t>0)
		{
			int n=Integer.parseInt(sc.next());
			int[][] a=new int[n][n];
			for(int i=0;i<n;i++)
				for(int j=0;j<n;j++)
    				a[i][j]=Integer.parseInt(sc.next());
    		
			int k=Integer.parseInt(sc.next());
		    Solution ob = new Solution();
		    System.out.println(ob.kthSmallest(a,n,k));
		    
		    t--;
		}
	}
}

// } Driver Code Ends


//User function Template for Java


class Solution
{
	public static int kthSmallest(int[][]mat,int n,int k)
	{
        //code here.
        // System.out.println("array print :"+Arrays.deepToString(mat));
        
        PriorityQueue<int[]> pq=new PriorityQueue<>((a,b)->Integer.compare(a[0],b[0]));
        //num,row,col
        int m=mat[0].length;
        for(int i=0;i<Math.min(k,n);i++){
            
            int[] node=new int[]{mat[i][0],i,0};
            pq.add(node);
            
            
        }
        
        for(int i=1;i<k;i++){
            int[] node=pq.remove();
            int res=node[0];
            int currX=node[1];
            int currY=node[2];
            if(currY +1 <  mat[currX].length){
                int[] newNode=new int[]{mat[currX][currY+1], currX,currY+1};
                pq.add(newNode);
            }
            
        }
        
        return pq.remove()[0];
        
        
        
        
        
        
        
        
    }
}