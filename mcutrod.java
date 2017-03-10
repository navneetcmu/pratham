import java.util.*;
public class mcutrod{

  public static int opt(int[] p, int n){
    int[] r = new int[n];
    for(int i=0; i<n; i++){
      r[i] = -1;
    }//end for
    return mopt(p, n, r);
  } //end opt

  public static int mopt(int[] p, int n, int[] r){
    int q =-1, cost=0;
    if(r[n]>0){return r[n];}
    if(n==0){q=0;}
    for(int i=1; i<=n; i++) {
            if(q > p[i-1] + mcutrod.mopt(p, n-i, r)) {
                    cost = q;
            }
            else{
                    cost =  p[i-1] + mcutrod.mopt(p, n-i, r);
            }
    }
    return cost;
  }//end mopt

  public static void main(String[] args){
          int[] p = {1,5,8,9,10,17,17,20,24,30};
          int n =10;
          int profit = cutrod.opt(p, n);
          System.out.println(profit);
  }

} //end mcutrod
