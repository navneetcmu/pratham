public class kidcount {
	
	public static void main(String[] args) {
		kids[] a = new kids[15];
		int groups=0; 
		a[0] = new kids("navneet",1); 
		a[1] = new kids("pinky",2); 
		a[2] = new kids("makoda",3); 
		a[3] = new kids("anas",5); 
		a[4] = new kids("dada",3); 
		a[5] = new kids("baba",4); 
		a[6] = new kids("mallu",5); 
		a[7] = new kids("puch",1); 
		a[8] = new kids("babu",2);
		a[9] = new kids("paani",2);  
		a[10] = new kids("soni",1);  
		a[11] = new kids("pada",1);  
		a[12] = new kids("khatri",2);  
		a[13] = new kids("golu",6);  
		a[14] = new kids("vivek",4);  
		
		//To get highest no of group id. 
		for(int i=0; i<a.length;i++){
			if(groups<a[i].key()){
				groups = a[i].key();
			}
		}
		
		sort s = new sort(a, groups); 
	}

}

