class Solution {
    public int compareVersion(String version1, String version2) {
        
        String[] str1=version1.split("\\.");
        String[] str2=version2.split("\\.");
        
        int start1=0,start2=0;
        while(start1<str1.length || start2<str2.length){
            
            // int num1=start1>=str1.length ? 0 : Integer.valueOf(str1[start1]);
            // int num2=start2>=str2.length ? 0 : Integer.valueOf(str2[start2]);
            String s1=start1<str1.length ? str1[start1] : "0";
            String s2=start2<str2.length ? str2[start2] : "0";
            
            
            
            // System.out.println("num A:"+num1+" nums B :"+num2);
            start1++;
            start2++;
            if(compare(s1,s2)==0) continue;
            else
                return compare(s1,s2);
            
        }
        
        
        return 0;
        
        
        
    }
    
    private int compare(String s1,String s2){
         s1=removeFrontZero(s1);
         s2=removeFrontZero(s2);
        
        int len1=s1.length();
        int len2=s2.length();
        if(Integer.compare(len1,len2)!=0){
            return Integer.compare(len1,len2);
        }
        else{
            
            for(int i=0;i<len1;i++){
                if(Character.compare(s1.charAt(i),s2.charAt(i))==0) continue;
                return (s1.charAt(i)-s2.charAt(i)) > 0 ? 1 : -1;
            }      
            
            return 0;
            
        }
        
        
    }
    
    
    private String removeFrontZero(String str){
        int i=0;
        for( i=0;i<str.length();i++){
            if(str.charAt(i)=='0')
                continue;
            else break;
        }
        
        
        String res= str.substring(i);
        System.out.println(" res for :"+str+ "is :"+res);
        return res;
        
    }
}