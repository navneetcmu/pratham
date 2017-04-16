package strings;


public class msd{
	private static int R = 256;
	private static String[] aux; 
	
	private static int charAt(String s, int d){
		if(d<s.length()) return s.charAt(d); else return -1; 
	}
	
	public static void sort(String[] a){
		int N  = a.length;
		aux = new String[N];
		int d=0; 
		sort(a,0,N-1,d); 
	}
	
	private static void sort(String[] a, int lo, int hi, int d){
		
		if(hi<lo){
			return; 
		}
		
		int[] count = new int[R+2]; 
		
		//counting frequencies
		for(int i=lo; i<=hi; i++){
			count[charAt(a[i],d)+2]++; 
		}
		
		//summing frequencies (this will convert count to indicies) 
		for(int i=0; i<R+1; i++){
			count[i+1] += count[i]; 
		}
		
		//sorting
		
		for(int i =lo; i<=hi; i++){
			aux[count[charAt(a[i],d)+1]++] = a[i]; 
		}
		
		//copying back
		for(int i=lo; i<=hi; i++){
			a[i] =aux[i-lo]; 
		}
		
		//recursively sorting each subarray
		for(int i=0; i<R; i++){
			sort(a, lo+count[i], lo+count[i+1]-1, d+1);
		}
		
	}
	
	
	
public static void main(String[] args){
	String[] names = {"she","sells","seashells","by","the","seashore","the","shells","she","sells","are","surely","seashells"};
	sort(names); 
	
	for(int i=0; i<names.length;i++){
		System.out.println(names[i]); 
	}
}

}
