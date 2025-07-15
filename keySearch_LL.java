public class keySearch_LL {
    public static class Node{
        int data; 
        Node next;
         
        public Node(int data){
            this.data=data;
            this.next=null;
        }
    }
    public static Node head;
    public static Node tail;
    public static int size;

    public void addFirst(int data){
        Node newNode= new Node(data);
        size++;
        if(head==null){
            head=tail=newNode;
            return;
        }
        newNode.next=head;
        head=newNode;
    }
    public void addLast(int data){
        Node newNode= new Node(data);
            size++;
            if(head==null){
                head=tail=newNode;
                return;
            }
            tail.next=newNode;
            tail=newNode;
        }
    public void print(){
        Node temp=head;
        while(temp !=null){
            System.out.println(temp.data+"->");
            temp=temp.next;
        }
        System.out.println("null");
    }
    public int itrSearch(int key){
        Node temp=head;
        int i=0;

        while(temp != null){
            if(temp.data==key){
                return i;
            }
            temp=temp.next;
            i++;
        }
        return -1;
    }
     public static void main(String args[]){
        keySearch_LL ll= new keySearch_LL();
        ll.addFirst(9);
        ll.addFirst(3);
        ll.addLast(6);
        ll.addLast(4);
        ll.print();

     System.out.println(ll.itrSearch(6));
     System.out.println(ll.itrSearch(10));
    }
    }



