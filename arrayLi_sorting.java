import java.util.*;
public class arrayLi_sorting {
    public static void main(String args[]){
        ArrayList<Integer> li=new ArrayList<>();
        
        li.add(2);
        li.add(5);
        li.add(9);
        li.add(3);
        li.add(6);
        System.out.println(li);
        Collections.sort(li);
        System.out.println(li);
        Collections.sort(li,Collections.reverseOrder());
        System.out.println(li);
    }
}
