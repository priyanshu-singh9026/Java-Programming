public class removeFIRST_LL {
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
    public static int size;
   public void addFirst(int data){
     Node newData= new Node(data);
     size++;
      if(head==null){
        head=tail=newData;
        return;
      }
      newData.next=head;
      head=newData;
   }
   public void addLast(int data){
     Node newNode= new Node(data);
     size++;
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
   public void add(int idx , int data){
    Node newNode= new Node(data);
    size++;
    Node temp= head;
    int i=0;
    while(i<idx-1){
        temp=temp.next;
        i++;
    }
    newNode.next=temp.next;
    temp.next=newNode;
   }
   public int removeFirst(){
   if(size==0){
    System.out.println("LL is empity");
    return Integer.MIN_VALUE;
   }else if(size==1){
    int val=head.data;
    head=tail=null;
    return val;
   }
   int val = head.data;
   head=head.next;
   return val;
   }
   public static void main(String args[]){
    removeFIRST_LL ll= new removeFIRST_LL();
    ll.addFirst(2);
    ll.addFirst(1);
    ll.addLast(3);
    ll.addLast(4);
    ll.add(2, 9);
    ll.print();
    //System.out.println(ll.size);
    ll.removeFirst();
    ll.print();
   }
    
}
