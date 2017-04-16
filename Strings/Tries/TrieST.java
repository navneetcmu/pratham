import javax.xml.soap.Node;

public class TrieST<Value> {
	private static int R = 256;
	private node root;
	
	private static class node{
		private Object val;
		private node[] next = new node[R]; 
	}
	
	public Value get(String key){
		node x = get(root, key, 0); 
		if(x==null) return null;
		return (Value) x.val ; 
	}
	
	private node get(node x, String key, int d){
		if(x==null) return null;
		if(d == key.length()) return x;
		char c = key.charAt(d); 
		return get(x.next[c], key, d+1); 
	}
	
	public void put(String key, Value val){
		root = put(root, key, val, 0); 
	}
	
	private node put(node x, String key, Value val, int d){
		if(x==null) x = new node(); 
		if(d == key.length()){
			x.val = val;
			return x;
		}
		char c = key.charAt(d);
		x.next[c] = put(x.next[c], key, val, d+1);
		return x; 
	}
	

}
