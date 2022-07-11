class Solution {
    Map<String,Boolean> map=new HashMap();
    public boolean isInterleave(String s1, String s2, String s3) {
        
        // return isInterleave(s1,s2,s3,true) || isInterleave(s1,s2,s3,false);
        return isInterleave(s1,s2,s3,true,0,0,0) || isInterleave(s1,s2,s3,false,0,0,0);

    }
    private boolean isInterleave(String s1,String s2,String s3,boolean flag){
        if(s1.length()+s2.length()!=s3.length() ) return false;
        if(s1.length()==0) return s2.equals(s3);
        if(s2.length()==0) return s1.equals(s3);
        // String key=i+"@"+j+"@"+k ;
        // if(map.get(key)!=null) return map.get(key);
        boolean res=false;
        if(flag)
            res= s1.charAt(0) == s3.charAt(0) && (isInterleave(s1.substring(1),s2,s3.substring(1),!flag) || isInterleave(s1.substring(1),s2,s3.substring(1),flag));
        else
            res= s2.charAt(0) == s3.charAt(0) && (isInterleave(s1,s2.substring(1),s3.substring(1),!flag) || isInterleave(s1,s2.substring(1),s3.substring(1),flag));
        // map.put(key,res);
        return res;
        
    }
    
      private boolean isInterleave(String s1,String s2,String s3,boolean flag,int i,int j,int k){
          // System.out.println("i :"+i+" j : "+j+" k :"+k);
        if(s1.length()+s2.length()!=s3.length() ) return false;
        if(i==s1.length()) return s2.substring(j).equals(s3.substring(k));
        if(j==s2.length()) return s1.substring(i).equals(s3.substring(k));
        String key=i+"@"+j+"@"+k+"@"+flag ;
        if(map.get(key)!=null) return map.get(key);
        boolean res=false;
        if(flag)
            res= s1.charAt(i) == s3.charAt(k) && (isInterleave(s1,s2,s3,!flag,i+1,j,k+1) || isInterleave(s1,s2,s3,flag,i+1,j,k+1));
        else
            res= s2.charAt(j) == s3.charAt(k) && (isInterleave(s1,s2,s3,!flag,i,j+1,k+1) || isInterleave(s1,s2,s3,flag,i,j+1,k+1));
        map.put(key,res);
        return res;
        
    }
    
    
    
}