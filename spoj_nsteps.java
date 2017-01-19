import java.util.*;
public class spoj_nsteps{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int count = sc.nextInt();
    for(int i=0; i<count; i++){
        int x = sc.nextInt();
        int y = sc.nextInt();
        if(y>x) System.out.println("No Number");
        else if(x==y && x%2==0) System.out.println(2*x);
        else if(x==y && x%2!=0) System.out.println(2*x -1);
        else System.out.println(x+y - x%2);

    }//end for
  } //end main
} //end class
