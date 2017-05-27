public class Solution {
    public boolean isPalindrome(String s) {
        String pln = s.toLowerCase();
        int len = pln.length();
        if(len<2) return true;
        int i=0, j=len-1, x=0, y=0; 
        while(i<j){
            x = pln.charAt(i);
            y = pln.charAt(j);
            if(x < 48 || x > 122 || (x>57 && x<97)) i++;
            else if(y < 48 || y > 122 || (y>57 && y<97)) j--;
            else{
                if(x!=y) return false;
                i++;
                j--;
            }
        }
        return true; 
        
    }
}
