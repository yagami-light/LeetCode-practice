//{ Driver Code Starts
import java.io.*;
import java.util.*;


class IntMatrix
{
    public static int[][] input(BufferedReader br, int n, int m) throws IOException
    {
        int[][] mat = new int[n][];
        
        for(int i = 0; i < n; i++)
        {
            String[] s = br.readLine().trim().split(" ");
            mat[i] = new int[s.length];
            for(int j = 0; j < s.length; j++)
                mat[i][j] = Integer.parseInt(s[j]);
        }
        
        return mat;
    }
    
    public static void print(int[][] m)
    {
        for(var a : m)
        {
            for(int e : a)
                System.out.print(e + " ");
            System.out.println();
        }
    }
    
    public static void print(ArrayList<ArrayList<Integer>> m)
    {
        for(var a : m)
        {
            for(int e : a)
                System.out.print(e + " ");
            System.out.println();
        }
    }
}


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
            
            
            int[][] range = IntMatrix.input(br, n, 2);
            
            
            int q; 
            q = Integer.parseInt(br.readLine());
            
            
            int[] queries = IntArray.input(br, q);
            
            Solution obj = new Solution();
            ArrayList<Integer> res = obj.kthSmallestNum(n, range, q, queries);
            
            IntArray.print(res);
            
        }
    }
}

// } Driver Code Ends


class Solution {
    public static ArrayList<Integer> kthSmallestNum(int n, int[][] range, int q, int[] queries) {
        // code here
        Set<Integer> input=new HashSet();
        for(int[] _range: range){
            // System.out.println("print range :"+Arrays.toString(_range));
            input.addAll(java.util.stream.IntStream.range(_range[0],_range[1]+1).boxed().collect(java.util.stream.Collectors.toList()));
        }
        // System.out.println("input :"+input);
        List<Integer> list=new ArrayList(input);
        ArrayList<Integer> res=new ArrayList();
        Collections.sort(list);
        for(int k:queries){
            
            res.add((k-1 >=0 && (k-1)<list.size()) ?  (list.get(k-1)) : -1);
            
        }
        
        return res;
        
        
    }
    
    
    
    
}
        
