public class kidcount {
	
	public static void main(String[] args) {
		kids[] a = new kids[9];
		int groups = 5; 
		a[0] = new kids("navneet",1); 
		a[1] = new kids("pinky",2); 
		a[2] = new kids("makoda",3); 
		a[3] = new kids("anas",5); 
		a[4] = new kids("dada",3); 
		a[5] = new kids("baba",4); 
		a[6] = new kids("mallu",5); 
		a[7] = new kids("abhi",1); 
		a[8] = new kids("babu",2);  
		
		sort s = new sort(a, groups); 
	}
