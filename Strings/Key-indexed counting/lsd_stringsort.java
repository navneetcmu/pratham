package strings;

public class lsd_stringsort {
		
public static void sort(String[] a, int al, int sl){
			 	
		String[] aux = new String[a.length]; 
			
		for(int d=sl-1;d>=0;d--){
			
			int[] count = new int[al+2]; 
			
			for(int i=0; i<a.length; i++){
				count[a[i].charAt(d)+1]++; 
			}
			
			for(int i=0; i<count.length-1;i++){
				count[i+1] += count[i]; 
			}
		
			
			for(int i=0; i<a.length; i++){
				aux[count[a[i].charAt(d)]++] = a[i];
			}
			
			for(int i=0; i<aux.length; i++){
				a[i] = aux[i]; 
			}
		}
}

//test case 
public static void main(String[] args){
	String[] names = {"aaaaaaa","adaaaaa","acbaaaa","acbdaab","abcdabc"};
	int alphabet_length = 256; 
	int string_length = names[0].length(); 
	sort(names, alphabet_length, string_length); 
	
	for(int i=0; i<names.length; i++){
		System.out.println(names[i]);
	}
	
	
}
	

}
