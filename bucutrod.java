import java.util.*;
public class bucutrod{

public static int bopt(int[] p, int n){
  int[] r = new int[n];
  int q, cost=0;
  for(int y=0; y<n; y++){
    r[y] = 0;
  }//end for
  for(int j=1; j<=n; j++){
    q =-1;
    for(int i=1; i<=n; i++) {
            if(q > p[i-1] + bucutrod.bopt(p, n-i)) {
                    cost = q;
            }
            else{
                    cost =  p[i-1] + bucutrod.bopt(p, n-i);
            }
    }
    r[j] = cost;
  }//outer for
  return r[n];
}//end bopt method

public static void main(String[] args){
          int[] p = {1,5,8,9,10,17,17,20,24,30};
          int n =10;
          int profit = cutrod.opt(p, n);
          System.out.println(profit);
  }

}//end class
