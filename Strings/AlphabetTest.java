public class AlphabetTest{

public static void main(String[] args) {

  Alphabet alpha = new Alphabet(args[0]);
  int R = alpha.R();
  int[] count = new int[R];

  String s = "ABRACADABRA!";
  int N = s.length();
  for(int i=0; i<N; i++){
    if(alpha.contains(s.charAt(i)))
    count[alpha.toIndex(s.charAt(i))]++;
  }

  for(int c=0; c<R; c++){
    System.out.println(alpha.toChar(c)+"  "+count[c]);
  }

}
}
