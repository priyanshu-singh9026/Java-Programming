public class REMOVElast_LL {
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
    public int removeLast(){
        if(size==0){
            System.out.println("ll is empity");
            return Integer.MIN_VALUE;
        }else if(size==1){
           int val=head.data;
           head=tail=null;
           size=0;
           return val;
        }
        Node prev=head;
        for(int i=0; i<size-2; i++){
            prev=prev.next;
        }
        int val=prev.next.data;
        prev.next=null;
        tail=prev;
        size--;
        return val;
    }
    public static void main(String args[]){
        REMOVElast_LL ll= new REMOVElast_LL();
        ll.addFirst(9);
        ll.addFirst(3);
        ll.addLast(6);
        ll.addLast(4);
        ll.print();

        ll.removeLast();
        ll.print();
        System.out.println(ll.size);
    }
    }

