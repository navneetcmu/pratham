public class DFS {

private static Graph G;
private static int s;
private static boolean[] mark;

public static void dfs(Graph g){
        G = g;
        mark = new boolean[G.V];
} // end DFS constructor

public static void depth(int s){
        mark[s] = true;
        System.out.println("I am visiting node " + s);
        for(int y : G.adj(s)) {
                if(mark[y]==false) {
                        depth(y);
                }//end if
        }//end for
}//end dfs

} //end class
