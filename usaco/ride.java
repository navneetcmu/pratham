/*
ID: nsingh11
LANG: JAVA
TASK: gift1

*/

 import java.io.*;
 import java.util.*;

 class ride{
   public static void main(String[] args) throws IOException{

     BufferedReader f = new BufferedReader(new FileReader("gift1.in"));
     PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter("gift1.out")));
     StringTokenizer st = new StringTokenizer(f.readLine());

     String np = st.nextToken();
     String[] name = new String[np];
     int[] gave = new int[np];
     int[] rcv = new int[np];

     for(int i=0; i<np, i++){
        st = new StringTokenizer(f.readLine());
        np[i] = st.nextToken();
     }


     //st = new StringTokenizer(f.readLine());
     //String i2 = st.nextToken();



     out.println(np);
     out.close();
   }
 }
