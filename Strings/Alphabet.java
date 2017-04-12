public class Alphabet{

  private String S;

  public Alphabet(String S){
    this.S = S;
  }

  public char toChar(int index){
    return S.charAt(index);
  }

  public int toIndex(char c){
    return S.indexOf(String.valueOf(c));

  }

  public boolean contains(char c){
    return !(S.indexOf(String.valueOf(c))==-1);
  }

  public int R(){
    return S.length();
  }

  public int lgR(){
    return (int) Math.ceil(Math.log(S.length())/Math.log(2));
  }

}
