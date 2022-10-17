//{ Driver Code Starts
import java.io.*;
import java.util.*;

class GFG {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t;
        t = Integer.parseInt(br.readLine());
        while(t-- > 0){
            String str=br.readLine();
    		String[] starr=str.split(" ");
    		
    		//input n and d
    	    int n=Integer.parseInt(starr[0]);
    		int k= Integer.parseInt(starr[1]);
            
            starr = br.readLine().trim().split(" ");
            int[] price = new int[n];
            for(int i = 0; i < n; i++)
                price[i] = Integer.parseInt(starr[i]);
            
            Solution obj = new Solution();
            int res = obj.buyMaximumProducts(n, k, price);
            
            System.out.println(res);
            
        }
    }
}

// } Driver Code Ends


class Solution {
    public static int buyMaximumProducts(int n, int k, int[] price) {
        // code here
        
        List<int[]> priceIndex=new ArrayList();
        for(int i=0;i<n;i++){
            
            priceIndex.add(new int[]{price[i],i+1});
            
        }
        int stockscanBuy=0;
        Collections.sort(priceIndex,((a,b)->Integer.compare(a[0],b[0])));
        for(int[] num: priceIndex){
            
            // System.out.println(Arrays.toString(num));
            int maxStockCanBuy=Math.min(num[1],k/num[0]);
            // System.out.println("maxStockCanBuy : "+maxStockCanBuy);
            stockscanBuy+=maxStockCanBuy;
            k  -= maxStockCanBuy *(num[0]);
            // System.out.println("stockscanBuy :"+stockscanBuy +"k now is :"+k);
            
        }
        
        
        return stockscanBuy;
        
    }
}
        
