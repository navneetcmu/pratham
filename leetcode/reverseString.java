public class Solution {
    public String reverseString(String s) {
        int n = s.length();
        if(n==0 || n==1) return s;
        char[] rslt = new char[n];
        int lo=0, hi =n-1; 
        while(lo <= hi){
            rslt[lo] = s.charAt(hi);
            rslt[hi] = s.charAt(lo);
            lo++;
            hi--; 
        }
        String y = new String(rslt);
        return y; 
    }
}
