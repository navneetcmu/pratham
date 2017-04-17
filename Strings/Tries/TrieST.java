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
	
	public Iterable<String> keyThatMatch(String pat){
		Queue<String> q = new LinkedList<String>();
		collect(root, "", pat, q);
		return q; 
	}
	
	
	private void collect(node x, String pre, String pat, Queue<String> ans){
		
		int d = pre.length(); 
		if(x==null) return;
		if(d==pat.length() && x.val !=null) ans.add(pre); 
		if(d==pat.length()) return; 
		
		char next = pat.charAt(d); 
		for(char c=0; c<R; c++){
					if(next == '.' || next == c)
						collect(x.next[c], pre+c, pat, ans); 
				}
	}
	
	private void collect(node x, String pre, Queue<String> ans){
		if(x==null) return;
		
		if(x.val != null){
			ans.add(pre);
		}
		
		for(char c=0; c<R; c++){
					collect(x.next[c], pre+c, ans); 
				}
			}
	
	
public static void main(String[] args) {
		
		TrieST<Integer> st = new TrieST<Integer>();  
		st.put("by", 4); 
		st.put("sea", 3);
		st.put("sells", 7);
		st.put("she", 5);
		st.put("shells", 3);
		st.put("the", 5);
		String test = "sh";
		String match = ".he"; 
		
		Iterable<String> it = st.keys(); 
		Iterable<String> at1 = st.keysWithPrefix(test); 
		Iterable<String> zt1 = st.keyThatMatch(match); 
		Iterator<String> et = it.iterator(); 
		Iterator<String> at = at1.iterator(); 
		Iterator<String> zt = zt1.iterator(); 
		
		System.out.println("Demonstrating keys() function");
		while(et.hasNext()){
			System.out.println(et.next());
		}
		
		System.out.println("Demonstrating keyswithprefix() function with prefix = " + test);
		while(at.hasNext()){
			System.out.println(at.next());
		}
		
		System.out.println("Demonstrating keysThatMatch() function with match = " + match);
		while(zt.hasNext()){
			System.out.println(zt.next());
		}
		
	}

}
