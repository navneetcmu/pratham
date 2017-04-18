public class bsearch1 {
	
public static int bsearch(String text, String pattern){
	int n = text.length();
	int m = pattern.length();
	
	for(int i=0; i<=n-m; i++){
		
		int j;
		for(j=0; j<m; j++){
			if(text.charAt(i+j) != pattern.charAt(j)){
				break;
			}
			
		}
		if(j==m) return i;
	}
	return n; 
}
	
public static void main(String[] args){
	String text = "aaaaaaaaab";
	String pattern = "aaaab"; 
	int ans = bsearch(text, pattern); 
	System.out.println(ans);
}

}
