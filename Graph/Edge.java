public class Edge implements Comparable<Edge> {
	
	private final int v;
	private final int w;
	private final double weight; 

	public Edge(int v, int w, double weight){
		this.v =v;
		this.w=w;
		this.weight =wieght; 
		
	}
	
	public double wieght(){
		return weight;
	}
	
	public int either(){
		return v;
	}
	
	public int other(int vrtx){
		if(vrtx==v){return w;}
		else if(vrtx==w){return v;}
		else {System.out.println("Edge not correct");}
	}
	
	public int compareTo(Edge that){
		if(this.weight() < that.weight()) { return -1;}
		else if(this.weight() > that.weight()) { return 1;}
		else {return 0;}
		
	}
	
	
}
