class Solution {
    public int compareVersion(String version1, String version2) {
        
        String[] str1=version1.split("\\.");
        String[] str2=version2.split("\\.");
        
        int start1=0,start2=0;
        while(start1<str1.length || start2<str2.length){
            
            int num1=start1>=str1.length ? 0 : Integer.valueOf(str1[start1]);
            int num2=start2>=str2.length ? 0 : Integer.valueOf(str2[start2]);
            // System.out.println("num A:"+num1+" nums B :"+num2);
            start1++;
            start2++;
            if(Integer.compare(num1,num2)==0) continue;
            else
                return Integer.compare(num1,num2);
            
        }
        
        
        return 0;
        
        
        
    }
}