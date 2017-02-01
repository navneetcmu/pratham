public class Graphtest {

public static void main(String[] args){

        Graph gr = new Graph(13);
        gr.addEdge(0,1);
        gr.addEdge(0,2);
        gr.addEdge(0,5);
        gr.addEdge(0,6);
        gr.addEdge(6,4);
        gr.addEdge(4,3);
        gr.addEdge(4,5);
        gr.addEdge(5,3);
        gr.addEdge(7,8);
        gr.addEdge(9,10);
        gr.addEdge(9,11);
        gr.addEdge(9,12);
        gr.addEdge(11,12);

        int y=0;
        while(y<13) {
                for(int v : gr.adj(y)) {
                        System.out.println(v);
                }
                System.out.println("------");
                y++;
        }
        System.out.println("\n\n\n\n");
        int start =0;
        System.out.println("Starting node is : " + start);
        System.out.println("DFS STARTS BELOW");
        DFS.dfs(gr);
        DFS.depth(start);
        System.out.println("\n\n\n\n");
        System.out.println("BFS STARTS BELOW");
        BFS.bfs(gr);
        BFS.breath(start);
}//end main



} //end class
