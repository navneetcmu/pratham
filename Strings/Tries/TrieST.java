package string;

import java.util.*; 

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
	
	public Iterable<String> keys(){
		return keysWithPrefix(""); 
	}
	
	public Iterable<String> keysWithPrefix(String pre){
		Queue<String> q = new LinkedList<String>();
		collect(get(root, pre, 0), pre, q);
		return q; 
	}
	
	public  Iterable<String> collect(){
		Queue<String> q = new LinkedList<String>(); 
		for(int i=0; i<R; i++){
			if(root.next[i] != null){
				char c = (char) i; 
				String s = ""+c;
				collect(root.next[i], s, q);
			}
		}
		
		return q; 
	}
	
	private void collect(node x, String pre, Queue<String> ans){
		if(x==null) return;
		
		if(x.val != null){
			ans.add(pre);
		}
		
		if(x!=null){
			for(int c=0; c<R; c++){
				if(x.next[c] != null){
					char s = (char) c; 
					String updt = pre + s; 
					collect(x.next[c], updt, ans); 
				}
			}
		}
	}
	
	
	
	public static void main(String[] args) {
		
		TrieST<Integer> st = new TrieST<Integer>();  
		st.put("amul", 4); 
		st.put("neo", 3);
		st.put("navneet", 7);
		st.put("nalin", 5);
		st.put("nal", 3);
		st.put("vikas", 5);
		st.put("atul", 4);
		
		Iterable<String> it = st.keys(); 
		Iterable<String> at = st.keysWithPrefix("na"); 
		Iterable<String> zt = st.collect();
		Iterator<String> et = it.iterator(); 
		Iterator<String> at1 = at.iterator(); 
		Iterator<String> zt1 = zt.iterator(); 
		
		System.out.println("Demonstrating keys() function");
		while(et.hasNext()){
			System.out.println(et.next());
		}
		
		System.out.println("Demonstrating keyswithprefix() function");
		while(at1.hasNext()){
			System.out.println(at1.next());
		}
		
		System.out.println("Demonstrating collect() function");
		while(zt1.hasNext()){
			System.out.println(zt1.next());
		}
		
		
		
	}

}
