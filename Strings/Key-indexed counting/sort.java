public class sort {
	
	kids[] a; 
	kids[] aux; 
	
	public sort(kids[] a, int groups){
		this.a =a; 
		int[] count = new int[groups+2]; 
		aux = new kids[a.length]; 
		
		for(int i=0; i<a.length; i++){
			count[a[i].key()+1]++; 
		}
		
		for(int i=0; i<count.length-1;i++){
			count[i+1] += count[i]; 
		}
		
		for(int i=0; i<aux.length; i++){
			aux[count[a[i].key()]++] = a[i];
		}
		
		for(int i=0; i<aux.length; i++){
			System.out.println(aux[i].name()+" "+aux[i].key());
		}
	}

}
