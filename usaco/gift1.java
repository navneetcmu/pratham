 import java.io.*;
 import java.util.*;

 class gift1{
   public static void main(String[] args) throws IOException{

     BufferedReader f = new BufferedReader(new FileReader("gift1.in"));
     PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter("gift1.out")));
     StringTokenizer st = new StringTokenizer(f.readLine());

     int np = Integer.parseInt(st.nextToken());
     //String[] name = new String[np];
     LinkedList<String> name = new LinkedList<String>();
     int[] gave = new int[np];
     int[] rcv = new int[np];

     for(int i=0; i<np; i++){
        st = new StringTokenizer(f.readLine());
        //name[i] =st.nextToken();
        name.add(st.nextToken());
        gave[i]=0;
        rcv[i]=0;
     }

     String giver=" ", taker=" ";
     int amnt=0, num=0, crdt=0, back=0, cnt=0;
     int index=0;
     for(int j=0; j < np; j++){
       st = new StringTokenizer(f.readLine());
       giver = st.nextToken();
       st = new StringTokenizer(f.readLine());
       amnt = Integer.parseInt(st.nextToken());
       num =  Integer.parseInt(st.nextToken());
       if(num==0){
         crdt =0;
         back = amnt;
       }
       else{
         crdt = amnt/num;
         back = amnt % num;
       }

       index = name.indexOf(giver);
       if(index!=-1){
         rcv[index] = rcv[index] + back;
         gave[index] = gave[index] + amnt;
       }
       for(cnt=0; cnt<num; cnt++){
         st = new StringTokenizer(f.readLine());
         taker = st.nextToken();
         index = name.indexOf(taker);
         if(index!=-1){
           rcv[index] = rcv[index] + crdt;
         }
       }
     }

     for(int f2=0; f2<np; f2++){
      out.println(name.removeFirst()+" "+(rcv[f2]-gave[f2]));

     }
     //out.println(giver+" "+amnt+" "+num+" "+crdt+" "+back);
     out.close();
   }
 }
