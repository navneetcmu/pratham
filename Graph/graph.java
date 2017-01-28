public class graph{

  private final int V;
  private Bag<Integer>[] adj;

  public graph(int V){
    this.V = V;
    adj = (Bag<Integer>[]) new Bag[V];
    for(int v=0; v<V; v++){
      adj[v] = new Bag<Integer>();
    }//end for
  }//end constructor

  public void addEdge(int v, int w){
    adj[v].add(w);
    adj[w].add(v);
  }//end addEdge method

  public Iterable<Integer> adj(int v){
    return adj[v];
  }//end adjacent method
} //end Graph class
