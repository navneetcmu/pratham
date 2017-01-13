public class plndrm{

  public static void main(String[] args){
    char[] ch = args[0].toCharArray();
    int start =0;
    int end = ch.length -1;
    chck(ch, start, end);

  } //end main 

  public static void chck(char[] ch, int i, int j){
    if(i>=j){
      System.out.println("A palindrom");
      return;
    } //end if 
    else if(ch[i]==ch[j]){
      chck(ch, ++i, --j);
    } //end else if
    else{
      System.out.println("Not a palindrom");
    } //end else
  }//end rcrs method
} //end plndrm class
