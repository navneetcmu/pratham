import java.util.*;
public class CCtest{


  public static void main(String[] args){
    LinkedList<LinkedList> trplts;
    LinkedList<LinkedList> cycls;
    LinkedList<Integer> prnt;
    int val;

    Graph gr = new Graph(6);
    gr.addEdge(0,1);
    gr.addEdge(0,3);
    gr.addEdge(1,2);
    gr.addEdge(3,2);
    gr.addEdge(3,4);
    gr.addEdge(2,4);
    gr.addEdge(2,5);
    gr.addEdge(4,5);

    Graph gr2 = new Graph(5);
    gr2.addEdge(0,1);
    gr2.addEdge(0,2);
    gr2.addEdge(1,3);
    gr2.addEdge(3,2);
    gr2.addEdge(4,2);
    gr2.addEdge(3,4);

    Graph gr3 = new Graph(9);
    gr3.addEdge(0,1);
    gr3.addEdge(0,2);
    gr3.addEdge(1,3);
    gr3.addEdge(2,3);
    gr3.addEdge(2,4);
    gr3.addEdge(4,5);
    gr3.addEdge(3,7);
    gr3.addEdge(5,6);
    gr3.addEdge(6,7);
    gr3.addEdge(5,8);
    gr3.addEdge(6,8);
    gr3.addEdge(7,8);


    ChordlessCycles cc = new ChordlessCycles(gr);
    ChordlessCycles cc2 = new ChordlessCycles(gr2);
    ChordlessCycles cc3 = new ChordlessCycles(gr3);

    cc.find();
    cc2.find();
    cc3.find();

    cycls = cc.cycles;


    System.out.println("Printing chordless cycles");
    ListIterator<LinkedList> LS = cycls.listIterator();
    while(LS.hasNext()){
      prnt = LS.next();
      ListIterator<Integer> ls = prnt.listIterator();
      while(ls.hasNext()){
        System.out.println(ls.next());
      }
      System.out.println(" ");

    }
  } //end main
} //end class
