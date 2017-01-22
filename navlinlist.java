public class navlinlist<Item>{

private node<Item> head;
private node<Item> next;

class node<Item>{
  Item data;
  node next;

node(Item d, node nxt){data = d; next = nxt; }; //end constructor
} // end node class

public navlinlist(){
  node<Item> head = new node<Item>(null, null);
}

public void addfirst(Item dat){
    if(head==null) head = new node<Item>(dat, null);
    else {
      node<Item> temp = new node<Item>(head.data, head.next);
      //temp.data = head.data;
      //temp.next = head.next;
      head.data = dat;
      head.next = temp;
    }

}//end addfirst class

public void add(int index, Item data){
  if(head.data==null) head.data = data;
  else{
  node<Item> nw;
  node<Item> prev = head;
  for(int i=0; i<index-1; i++){
      prev = prev.next;
  }//end for
   nw = new node<Item>(data, prev.next);
   prev.next = nw;
 }
}// end add fucntion

public void traverse(){
  node<Item> temp = head;
  while(temp!=null){
    System.out.println(temp.data);
    temp = temp.next;
  } //end while
}//end traverse

public void addlast(Item data){
  if(head==null) {
  addfirst(data);
  }
  else{
    node<Item> temp = head;
    while(temp.next!=null){temp = temp.next;}
    temp.next = new node<Item>(data, null);
  }
}//end addlast

public void add(Item data){
  addlast(data);
}
} //end navlinlist class
