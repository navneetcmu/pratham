/*
ID: nsingh1
LANG: JAVA
TASK: friday
*/

import java.io.*;
import java.util.*;

class friday{
  public static void main(String[] args) throws IOException{

    BufferedReader f = new BufferedReader(new FileReader("friday.in"));
    PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter("friday.out")));
    StringTokenizer st = new StringTokenizer(f.readLine());
    int N = Integer.parseInt(st.nextToken());
    int month, len;
    LinkedList<Integer> week = new LinkedList<Integer>();
    int[] r = new int[7];
    week.add(0);week.add(1);week.add(2);week.add(3);week.add(4);week.add(5);week.add(6);
    for(int year=0; year<N; year++){
      for(month=1; month<=12; month++){
        if(month==2){
           len = leap_check(year);
           count(week,len, r);
        }
        else if(month==1||month==3||month==5||month==7||month==8||month==10||month==12){
          len = 31;
          count(week,len, r);
        }
        else{
          len = 30;
          count(week,len, r);
        }
      }
    }
    out.println(r[5]+" "+r[6]+" "+r[0]+" "+r[1]+" "+r[2]+" "+r[3]+" "+r[4]);
    out.close();
  }

  public static int leap_check(int yer){
    int y = 1900+yer;
    if(y%400==0){
      return 29;
    }
    else if(y%4==0 && y%100!=0){
      return 29;
    }
    else{
      return 28;
    }
  }

  public static void count(LinkedList<Integer> week, int len, int[] r){
    int index=0;
    for(int i=1; i<=len; i++){
      if(i==13){
        index = week.getFirst();
        r[index] = r[index] + 1;
      }
      week.add(week.removeFirst());
    }
  }
}
