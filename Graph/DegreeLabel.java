//Finding chordless cycle in a Graph
//Based on Algo mentioned paper "Efficient enumeration of chordless cycles"
//by Elisangela S. Dias et al.

public class DegreeLabel{
  Graph G;  //our graph
  int n;
  int[] lbl;    //label
  int[] degree; //degree of a vertex
  boolean[] color; //color of a node
  int u;


  public DegreeLabel(Graph Grph){
    this.G = Grph;
    n = G.V;
    lbl = new int[n];
    degree = new int[n];
    color = new boolean[n];

    for(int v = 0; v < n; v++){
      degree[v] = 0;
      color[v] = false;
      for(int y : G.adj(v)){
        degree[v] = degree[v] +1;
      }//end inner for
  }//end outer for loop

  } //end constructor

public int[] label(){

  for(int i=1; i<n+1; i++){
    int min_degree = n;

    for(int x = 0; x < n; x++){
      if((color[x]==false) && (degree[x] < min_degree)){
          u = x;
          min_degree = degree[x];
      }//end if
    }//end for loop

    lbl[u] = i;
    color[u] = true;

    for(int y : G.adj(u)){
      if(color[y]==false){
          degree[y] = degree[y] - 1;
      } // end if
    } //end for

  }//end for

  return lbl;
} // end label method

} // end class
