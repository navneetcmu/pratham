import java.util.*;
public class BFS {
private static Graph G;
private static boolean[] mark;

public static void bfs(Graph g){
        G = g;
        mark = new boolean[G.V];
}   // end DFS constructor

public static void breath(int s){

        Queue<Integer> q = new LinkedList<Integer>();
        q.add(s);
        mark[s] = true;
        System.out.println("I visited point:  " + s);
        while(!q.isEmpty()) {
                int vrt = q.remove();
                for(int y : G.adj(vrt)) {
                        if(mark[y]==false) {
                                q.add(y);
                                mark[y] = true;
                                System.out.println("I visited point:  " + y);
                        }//if end

                }//for end

        }//while end
        System.out.println("Search complete....my watch ends");


}//end breath class

} // end BFS class
