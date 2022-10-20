//{ Driver Code Starts
import java.io.*;
import java.util.*;


class IntArray
{
    public static int[] input(BufferedReader br, int n) throws IOException
    {
        String[] s = br.readLine().trim().split(" ");
        int[] a = new int[n];
        for(int i = 0; i < n; i++)
            a[i] = Integer.parseInt(s[i]);
        
        return a;
    }
    
    public static void print(int[] a)
    {
        for(int e : a)
            System.out.print(e + " ");
        System.out.println();
    }
    
    public static void print(ArrayList<Integer> a)
    {
        for(int e : a)
            System.out.print(e + " ");
        System.out.println();
    }
}

class GFG {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t;
        t = Integer.parseInt(br.readLine());
        while(t-- > 0){
            
            int n; 
            n = Integer.parseInt(br.readLine());
            
            
            int[] arr = IntArray.input(br, n);
            
            Solution obj = new Solution();
            ArrayList<Integer> res = obj.findLeastGreater(n, arr);
            
            IntArray.print(res);
            
        }
    }
}

// } Driver Code Ends


class Solution {
    public static ArrayList<Integer> findLeastGreater(int n, int[] arr) {
        // code here
       TreeMap<Integer,TreeSet<Integer>> map=new TreeMap<>();
        for(int i=0;i<arr.length;i++){
            map.putIfAbsent(arr[i],new TreeSet<>());
            map.get(arr[i]).add(i);
        }
        ArrayList<Integer> res=new ArrayList<>();


        for(int i=0;i<n;i++){
            TreeSet<Integer> setForElement=map.get(arr[i]);
            if(setForElement.size()==1)
                // setForElement.remove((Integer) arr[i]);
                map.remove(arr[i]);
            else{
                setForElement.remove(setForElement.first());
                // if(setForElement.size()==0)
                
            }
//            System.out.println("set :"+set);
            Integer justHigher=map.higherKey(arr[i]);
            res.add(justHigher ==null ? -1 : justHigher);
        }

        return res;
    }
}
        
