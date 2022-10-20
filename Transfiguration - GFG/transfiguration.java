//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;
class GfG
{
    public static void main(String args[])throws IOException
        {
            BufferedReader br = new BufferedReader( new InputStreamReader(System.in));
            int t = Integer.parseInt(br.readLine());
            while(t-->0)
                {
                    String arr[] = br.readLine().split(" ");
                    String A = arr[0];
                    String B = arr[1];
                    Solution obj = new Solution();
                    System.out.println(obj.transfigure (A, B));
                }
        }
}
// } Driver Code Ends


//User function Template for Java

class Solution
{
    int transfigure (String A, String B)
    {
    	// Your code goes here.
    	int[] charIndex=new int[512];
    	int len1=A.length();
    	int len2=B.length();
    	if(len1!=len2) return -1;
    	for(int i=0;i<len1;i++){
    	    
    	    charIndex[A.charAt(i)-'A']++;
    	    charIndex[B.charAt(i)-'A']--;
    	    
    	    
    	}
    // 	System.out.println("print array :"+Arrays.toString(charIndex));
    	for(int i=0;i<charIndex.length;i++){
    	    if(charIndex[i]!=0) return -1;
    	}
    	
    	int i=len1-1;
    	int j=len1-1;
    	int count=0;
    	while(i>=0 && j>=0){
    	    
    	    char a=A.charAt(i);
    	    char b=B.charAt(j);
    	   // System.out.println("char a :"+a+" char b :"+b);
    	    if(a==b){
    	        i--;j--;
    	    }else{
    	        i--;
    	        count++;
    	        
    	    }
    	    
    	    
    	}
    	
    // 	System.out.println("returning count ..");
    	return count;
    	
    	
    	
    	
    }
}

/*

GEEKSFORGEEKS
FORGEEKSGEEKS




*/