public class Solution {
    // you need treat n as an unsigned value
    public int reverseBits(int n) { 
        String s = Integer.toBinaryString(n);
        String comp=""; 
        int len = s.length();
        int loop = 32 - len;
        while(loop!=0){
        	comp = comp + "0";
        	loop--; 
        }
        s = comp+s;
        //System.out.println(s);
        //System.out.println(s.length());
        char[] bin = s.toCharArray(); 
        int i=0, j=31;
        char temp; 
        while(i<j){
            temp = bin[i];
            bin[i] = bin[j];
            bin[j] = temp; 
            i++;
            j--; 
        }
        String result = new String(bin);  
        return Integer.parseUnsignedInt(result, 2); 
        
    }
}
