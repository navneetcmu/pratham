public class DoublyLinkedList{
  DoubleNode head;
  DoubleNode tail;

  public DoublyLinkedList(){
         this.head = null;
         this.tail = null;
  }//end constructor

  public void addCharAtEnd(char c){
    if(head==null){
       DoubleNode new_node = new DoubleNode(null, c, null);
       head = new_node;
       tail = head;
    }
    //else if(head==tail){
    //  DoubleNode temp = new DoubleNode(head, c, null);
    //  tail = temp;
    //  head.next = tail ;
    //}
    else{
      DoubleNode temp = new DoubleNode(tail, c, null);
      tail.next=temp;
      tail = temp;
    }
  }//end addCharAtEnd method

  public void addCharAtFront(char c){
    if(head==null){
       DoubleNode new_node = new DoubleNode(null, c, null);
       head = new_node;
       tail = head;
    }
    else{
      DoubleNode temp = new DoubleNode(null, c, head);
      head.prev = temp;
      head = temp;
    }

  }//end addCharAtFront method

  public int countNodes(){
    if(head==null){return 0;}
    DoubleNode temp = head;
    int i=1;
    while(temp.next!=null){
      temp =temp.next;
      i++;
     }
     return i;
  }//end countNodes

  public boolean deleteChar(char c){
    // if head is not initialized
    if(head==null){return false;}

    // if head is to be deleted
    if(head.ch==c){
      char val = removeCharFromFront();
      return true;
    }
    //rest cases
    DoubleNode temp = head;
    while(temp.next!=null){
      if(temp.ch==c){
         (temp.prev).next = temp.next;
         (temp.next).prev = temp.prev;
         return true;
      }
      temp = temp.next;
    }//end while

    if(temp.ch==c){
      (temp.prev).next = null;
      return true;
    }//end if

    return false;
  }//end deleteChar method

  public boolean isEmpty(){
    if(head==null) {return true;}
    else {return false;}

  }//end isEmpty method

  public char removeCharAtEnd(){
    if(head==null){System.out.println("Empty list");}
    if(tail.prev==null){
      char val = tail.ch;
      head =null;
      tail=null;
      return val;
    }
    char val = tail.ch;
    DoubleNode temp = tail.prev;
    temp.next=null;
    tail = temp;
    return val;
  }//end removeCharAtEnd method

  public char removeCharFromFront(){
    if(head==null){System.out.println("Empty List !");}
    if(head.next==null){
      char val =head.ch;
      head=null;
      tail = head;
      return val;
    }
    char val = head.ch;
    DoubleNode temp = head.next;
    head.ch = temp.ch;
    head.prev = null;
    head.next = temp.next;
    return val;
  }//end removeCharFromFront method

  public void traverse(){
    if(head==null){
      System.out.println("List Empty");
      return;
    }
    DoubleNode temp = head;
    while(temp.next!=null){
        System.out.println(temp.ch);
        temp = temp.next;
    } //end while
    System.out.println(temp.ch);
  }//end traverse

  public void reverse(){
    if(head==null){return;}

    DoubleNode count = head;

    while(count.next!=null){

      DoubleNode temp = new DoubleNode(count.next, count.ch, count.prev);
      count.ch = temp.ch;
      count.prev = temp.prev;
      count.next = temp.next;

      count = count.prev;

    }//end while

    DoubleNode temp = new DoubleNode(count.next, count.ch, count.prev);
    count.ch = temp.ch;
    count.prev = temp.prev;
    count.next = temp.next;

    DoubleNode tempo = head;
    head = count;
    tail = tempo;
  }

} //end class
