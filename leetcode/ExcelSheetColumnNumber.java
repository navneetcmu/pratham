public class Solution {
    public int titleToNumber(String s) {
        int column_number=0; 
        int len = s.length(); 
        for(int i =0; i<len; i++){
            column_number = column_number + (s.charAt(i)-64) * (int) Math.pow(26, len-i-1); 
        }
        //Formula for length 3 
        //((s.charAt(0)-64)*26*26 + (s.charAt(1)-64)*26 + (s.charAt(2)-64));
        return column_number; 
    }
}
