import java.util.*;
public class ChordlessCycles{

  Graph G;
  int v;
  int[] l;
  int[] blocked;
  LinkedList<LinkedList> triplets;
  LinkedList<LinkedList> cycles;
  LinkedList<Integer> path;

public ChordlessCycles(Graph grph){
    G = grph;
    v = grph.V;
    blocked = new int[v];
    l = new int[v];

    // calling DegreeLabel class here

    DegreeLabel dg = new DegreeLabel(G);
    l = dg.label();
    // got an labelled array

}//end constructer


public void triplets(){
  triplets = new LinkedList<LinkedList>();
  cycles = new LinkedList<LinkedList>();

  for(int u = 0; u < v; u++){
    // here we have to generate all the triplets
    for(int x : G.adj(u)){
      for(int y : G.adj(u)){
        if((l[u] < l[x]) && (l[x] < l[y])){
          if(edge(x,y)){
            LinkedList<Integer> cyc = new LinkedList<Integer>();
            cyc.add(x);
            cyc.add(u);
            cyc.add(y);
            cycles.add(cyc);
          }//end if
          else{
            LinkedList<Integer> trip = new LinkedList<Integer>();
            trip.add(x);
            trip.add(u);
            trip.add(y);
            triplets.add(trip);
          }

        }//end if

        //to avoid printing twice
        /*if((l[u] < l[y]) && (l[y] < l[x])){
          if(edge(x,y)){
            LinkedList<Integer> cyc = new LinkedList<Integer>();
            cyc.add(y);
            cyc.add(u);
            cyc.add(x);
            cycles.add(cyc);
          }//end if
          else{
            LinkedList<Integer> trip = new LinkedList<Integer>();
            trip.add(y);
            trip.add(u);
            trip.add(x);
            triplets.add(trip);
          }
        } //end if */

      }//end inner loop
    }//end outer for

  }//end for
}//end triplets

public void find(){
    triplets();
    for(int i = 0; i<v; i++){
      blocked[i] = 0;
    }// end for

    while(triplets.size() > 0){

      // getting a chordless path and removing it from list
      path = triplets.getFirst();
      triplets.removeFirst();

      int u_mid = path.get(1);
      BlockNeighbours(u_mid);
      CC_visit(path, l[u_mid]);
      UnblockNeighbours(u_mid);

    }//end while
}//end find method

public boolean edge(int x1, int y1){
  for(int z1 : G.adj(x1)){
    if(z1 == y1){
      return true;
    } //end if
  }//end for
  return false;
}

public void BlockNeighbours(int v1){
  for(int zx : G.adj(v1)){
    blocked[zx] = blocked[zx] + 1;
  }// end for
} // end BlockNeighbours

public void UnblockNeighbours(int v2){
  for(int zy : G.adj(v2)){
    if(blocked[zy] > 0){
      blocked[zy] = blocked[zy] - 1;
  } //end if
  }// end for
} // end UnblockNeighbours

public void CC_visit(LinkedList<Integer> p, int key){

  LinkedList<Integer> p_dash;

  int ut = p.getLast();
  int u1 = p.getFirst();

  BlockNeighbours(ut);

  for(int zs : G.adj(ut)){
    if((l[zs]>key) && (blocked[zs]==1)){
      p_dash = (LinkedList) p.clone();
      p_dash.addLast(zs);

      if(edge(zs, u1)){
          cycles.add(p_dash);
      }//end inner if
      else{
          CC_visit(p_dash, key);
      } // end else
    }//end outer if
  } //end for

  UnblockNeighbours(ut);
}//end method CC_vist

} // end class
