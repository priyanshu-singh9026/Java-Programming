import java.util.*;

public class Searching_linkedlist {
    public static class Node{
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
        Node newNode= new Node(data);
        if(head==null){
            head=tail=newNode;
            return;

        }else{
            newNode.next=head;
            head=newNode;
        }
        public void print(int data){
            int temp=head;
            if(temp==null){
                
            }
        }
     }
    public static void main(String args[]){
        LinkedList ll= new LinkedList();
        ll.addFirst(1);
        ll.addFirst(2);
    }
}
