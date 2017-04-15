public class msd{
	private static int R = 256;
	private static String[] aux; 
	
	private static int charAt(String s, int d){
		if(d<s.length()) return s.charAt(d); else return -1; 
	}
	
	public static void sort(String[] a){
		int N  = a.length;
		aux = new String[N];
		sort(a,0,N-1,0); 
	}
	
	private static void sort(String[] a, int lo, int hi, int d){
		int count = new int[R+2]; 
		for(int i=lo; i<=hi; i++){
			//count[charAt(a[i],d)+2]++; 
			System.out.println(charAt(a[i],d)+2);
		}
		
	}
	
	
	
public static void main(String[] args){
	String[] names = {"she","sells","seashells","by","the","seashore","the","shells","she","sells","are","surely","seashells"};
	sort(names); 
}

}
