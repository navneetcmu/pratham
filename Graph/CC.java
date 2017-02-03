//Code to find connected path in a graph.
public class CC {
boolean[] mark;
int[] id;
int count;

public CC(Graph g){
        mark = new boolean[g.V];
        id = new int[g.V];
        for(int i=0; i<g.V; i++) {
                if(mark[i]==false) {
                        dfs(g,i);
                        count++;
                }//end if
        } //end for
}  //end constructor

public int count(){
        return count;
}//end count method

public int id(int v) {
        return id[v];
}//end id method

public void dfs(Graph g, int v){
        mark[v] = true;
        id[v]=count;
        for(int w : g.adj(v)) {
                if(!mark[w]) {
                        dfs(g,w);
                }//end if
        }//end for
} //end method
} // end class
