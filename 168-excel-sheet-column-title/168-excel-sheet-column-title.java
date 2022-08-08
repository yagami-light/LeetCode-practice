class Solution {
    public String convertToTitle(int columnNumber) {
        System.out.println("columnNumber :"+columnNumber);
        if(columnNumber==0) return "";
        // char res=(char)((columnNumber%26)+'A');
        // System.out.println("res :"+res);
        
        return ""+convertToTitle((--columnNumber/26))+(char)((columnNumber%26)+'A');
        
    }
}