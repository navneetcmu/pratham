public class sort {
	
	kids[] a; 
	
	public sort(kids[] a, int groups){
		this.a =a; 
		int[] count = new int[groups+2]; 
		
		for(int i=0; i<a.length; i++){
			count[a[i].key()+1]++; 
		}
		
		for(int i=0; i<count.length; i++){
			System.out.println(count[i]);
		}
	}

}
