class Solution {
    
    public int numDecodings(String s){
        int[] cache=new int[s.length()+1];
        
        return numDecodingsUtil2(0,s,cache);
    }
    
    
    private int numDecodingsUtil2(int p,String s,int[] cache){
        int n=s.length();
        if(p==n) return 1;
        
        if(s.charAt(p)=='0')
            return 0;
        if(cache[p]!=0)
            return cache[p];
        
        int res=numDecodingsUtil2(p+1,s,cache);
        
        if(p<n-1 && (s.charAt(p)=='1' || s.charAt(p)=='2' &&  s.charAt(p+1) < '7'))
            res+=numDecodingsUtil2(p+2,s,cache);
        
        cache[p] = res;
        return cache[p];
        
        
    }
    
    
    
   /*   int n=s.length();
        if(p==n) return 1;
        if(s.charAt(p)=='0') return 0;
        int res=numDecodings(p+1,s);
        if(p<n-1&&(s.charAt(p)=='1'||s.charAt(p)=='2'&&s.charAt(p+1)<'7')) 
			res+=numDecodings(p+2,s);
        return res;
    */
    
    private  int numDecodingsUtil1(String s) {
        
        if(s==null || s.length() ==0)
            return 0;
        
        int n=s.length();
        int[] dp=new int[n+1];
        dp[0]=1;
        dp[1]=s.charAt(0)!='0' ? 1 : 0;
        for(int i=2;i<=n;i++){
            
            int first=Integer.valueOf(s.substring(i-1,i));
            int second=Integer.valueOf(s.substring(i-2,i));
            
            if(first>=1 && first<=9){
                dp[i]+=dp[i-1];
                
            }
            
            if(second>=10 && second<=26)
                dp[i]+=dp[i-2];
            
        }
        
        
        return dp[n];
        
        
    }
}