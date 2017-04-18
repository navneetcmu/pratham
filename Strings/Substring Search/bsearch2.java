public class bsearch2 {
	
	public static int search2(String text, String pattern){
		int j, m = pattern.length();
		int i, n = text.length();
		
		for(i=0, j=0; i<n && j<m; i++){
			if(text.charAt(i) == pattern.charAt(j)) j++;
			else{
				i = i-j; 
				j=0; 
			}	
		}
		
		if(j==m) return i-m; 
		else return n; 
	}

	public static void main(String[] args){
		String text = "navnetsingh";
		String pattern = "vnes"; 
		int ans = search2(text, pattern); 
		System.out.println(ans);
	}

}
