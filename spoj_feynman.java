import java.util.*;
import java.lang.*;

class spoj_feynman
{
public static void main (String[] args) throws java.lang.Exception
{
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int rslt;
        while(num!=0) {
                System.out.println(numsqr(num));
                num = sc.nextInt();
        }
}

private static int numsqr(int num){
        int sum=0, rslt =0, end=0;
        for(int sqrsize =1; sqrsize<=num; sqrsize++) {
                end = sqrsize;
                while(end<=num) {
                        sum = sum + 1;
                        end++;
                }
                rslt = rslt + (sum * sum);
                sum=0;
        }
        return rslt;
}
}
