public class Graphtest {

public static void main(String[] args){

        Graph gr = new Graph(7);
        gr.addEdge(0,1);
        gr.addEdge(0,2);
        gr.addEdge(0,5);
        gr.addEdge(0,6);
        gr.addEdge(6,4);
        gr.addEdge(4,3);
        gr.addEdge(4,5);
        gr.addEdge(5,3);

        int y=0;
        while(y<7) {
                for(int v : gr.adj(y)) {
                        System.out.println(v);
                }
                System.out.println("------");
                y++;
        }
}//end main

} //end class
