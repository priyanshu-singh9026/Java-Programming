import java.util.*;
public class push_Stack {
    public static void main(String args[]){
        Stack<Integer> push=new Stack<>();
        push.add(10);
        push.add(20);
        push.add(30);
        push.add(40);
        System.out.println(push);
        int s=push.size();
        System.out.println(s);
        //int top=push.peek();
        //System.out.println(top);
    }
}
