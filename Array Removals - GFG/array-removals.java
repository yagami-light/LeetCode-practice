//{ Driver Code Starts
//Initial Template for Java

import java.util.*;
import java.io.*;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int tc = Integer.parseInt(br.readLine().trim());
        while (tc-- > 0) {
            String[] inputLine;
            inputLine = br.readLine().trim().split(" ");
            int n = Integer.parseInt(inputLine[0]);
            int k = Integer.parseInt(inputLine[1]);
            int[] arr = new int[n];
            inputLine = br.readLine().trim().split(" ");
            for (int i = 0; i < n; i++) {
                arr[i] = Integer.parseInt(inputLine[i]);
            }

            int ans = new Solution().removals(arr, n, k);
            System.out.println(ans);
        }
    }
}

// } Driver Code Ends


//User function Template for Java

class Solution {
    Map<String,Integer> cache=new HashMap();
    int removals(int[] arr, int n, int k) {
        // code here
        Arrays.sort(arr);
        int start=0, end=n-1;
        // System.out.println("arr :"+Arrays.toString(arr));
        return helper(arr,start,end,n,k);
        
    }
    private int helper(int[] arr,int start,int end,int n,int k){
        if(n==1) return 0;
        if(arr[end]-arr[start] <=k) return 0;
        if(start==end) return 0;
        String key=start+"@"+end;
        if(cache.containsKey(key)) return cache.get(key);
        int res= 1+Math.min(helper(arr,start+1,end,n,k),helper(arr,start,end-1,n,k));
        cache.put(key,res);
        return res;
        
    }
    
    
}