public class plndrm{

  public static void main(String[] args){
    char[] ch = args[0].toCharArray();
    int start =0;
    int end = ch.length -1;
    rcrs(ch, start, end);

  }

  public static void rcrs(char[] ch, int i, int j){
    if(i>=j){
      System.out.println("A palindrom");
      return;
    }
    else if(ch[i]==ch[j]){
      rcrs(ch, ++i, --j);
    }
    else{
      System.out.println("Not a palindrom");
}
}
}
