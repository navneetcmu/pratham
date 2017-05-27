public class Solution {
    public boolean isAnagram(String s, String t) {
        int s_len = s.length();
        int t_len = t.length(); 
        int[] s_c = new int[26];
        int[] t_c = new int[26];
        
        if(s_len!=t_len) return false; 
        
        for(int i=0; i<s_len; i++){
            s_c[s.charAt(i)-97] +=1;
            t_c[t.charAt(i)-97] +=1; 
        }
        
        for(int i=0; i<26; i++){
            if(s_c[i]!=t_c[i]) return false;
        }
        
        return true; 
    }
}
