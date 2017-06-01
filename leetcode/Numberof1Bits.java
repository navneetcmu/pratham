public class Solution {
    // you need to treat n as an unsigned value
    public int hammingWeight(int n) {
       int scan = 0x1; 
       int result=0;
       
       for(int i=0; i<32; i++){
           result += (scan & n);
           n = n >> 1; 
       }
       return result; 
    }
}
