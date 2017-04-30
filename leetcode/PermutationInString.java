//https://leetcode.com/problems/permutation-in-string

//leetcode weekly contest 4/30/2017

public class Solution {
	
    int[] R; 
	
    public boolean checkInclusion(String s1, String s2) {
    	int i=0; int y; 
    	String cut; 
    	while(i < s2.length()){
    		if(s1.indexOf(s2.charAt(i))!=-1){
    		   if((i+s1.length())>s2.length()) return false;  
    		   cut = s2.substring(i, i+s1.length()); 
    		   //System.out.println(cut+" "+s1);
    		   if(match(cut, s1)) return true; 
    		   i++; 
    		}
    		else{
    			i++; 
    		} 
    	}
    	return false; 
        
    }
    
    public boolean match(String cut, String s1){
    	R = new int[26]; 
    	int sum =0; 
    	for(int i=0; i<s1.length(); i++){
    		R[cut.charAt(i)-97] += 1;
    		R[s1.charAt(i)-97] += -1; 
    	}
    	
    	for(int j=0; j<26; j++){
    		if(R[j] != 0) return false;  
    	}
    	
    	return true; 
    	
    }
}
