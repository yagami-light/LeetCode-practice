//{ Driver Code Starts
//initial code
import java.util.*;
import java.lang.*;
class InterLeaveString
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t>0)
        {
            String a =sc.next();
            String b = sc.next();
            String c = sc.next();
            Solution g=new Solution();
        
            System.out.println(g.isInterLeave(a,b,c)==true?1:0);
            t--;
        }
    }
}


// } Driver Code Ends


/*you are required to complete this method */
class Solution {
    Map<String,Boolean> map=new HashMap();
	public boolean isInterLeave(String a,String b,String c)
	{
            //Your code here
            
            return helper(a,b,c,0,0,0);
            
            
	}
	
	public boolean helper(String str1,String str2,String str3,int i,int j,int k){
	    int len1=str1.length();
	    int len2=str2.length();
	    int len3=str3.length();
	    if(len1 + len2 != len3) return false;
	    if(i==str1.length() && j==str2.length() && k==str3.length()) return true;
	   // if(i==str1.length() && j!=str2.length()) return false;
	   // if(i!=str1.length() && j==str2.length()) return false;

        String key=i+"@"+j+"@"+k;
        if(map.containsKey(key)) return map.get(key);
	    
	    boolean res=false;
	    
	  char ch1=i<len1 ? str1.charAt(i) : '@';
	   char ch2=j<len2 ? str2.charAt(j) : '@';
	    char ch3=str3.charAt(k);
	    if(ch1==ch3) res |= helper(str1,str2,str3,i+1,j,k+1);
	    if(ch2==ch3) res |= helper(str1,str2,str3,i,j+1,k+1);
	    
	    
	    
	    map.put(key,res);
	    return res;
	    
	    
	    
	    
	    
	    
	}
	
}

/*
1. cvheck length and sum of length
2. 

XAYBCZ


*/