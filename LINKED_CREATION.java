public class LINKED_CREATION {
    public static class Node {
        int data;
        Node next;

        public Node (int data){
            this.data=data;
            this.next=null;
        }
    }
    public static Node head;
    public static Node tail;
   public void addFirst(int data){
     Node newData= new Node(data);
      if(head==null){
        head=tail=newData;
        return;
      }
      newData.next=head;
      head=newData;
   }
   public void addLast(int data){
     Node newNode= new Node(data);
     if(head==null){
        head=tail=newNode;
        return;
     }

     tail.next= newNode;
      tail= newNode;
   }
   public void print(){
    Node temp= head;
    while(temp != null){
        System.out.print(temp.data+"->");
        temp=temp.next;
    }
    System.out.println("null ");
   }
   public static void main(String args[]){
    LINKED_CREATION ll= new LINKED_CREATION();
     ll.print();
    ll.addFirst(2);
    ll.print();
    ll.addFirst(1);
  ll.print();
    ll.addLast(3);
    ll.print();
    ll.addLast(4);
    ll.print();
   }
}
    
