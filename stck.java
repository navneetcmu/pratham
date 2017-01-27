public class stck<Item>{
  private Item[] data;
  private int plc=0;

public stck(int size){
   data = (Item[]) new Object[size];
} //end constructor


public void push(Item item){
 data[plc++] = item;
}//end push

public Item pop(){
  return data[--plc];
}// end pop

boolean isempty(){
  return plc == 0;
}//end isempty
} //end class
