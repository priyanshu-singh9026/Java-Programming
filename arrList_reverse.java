import java.util.*;
public class arrList_reverse {
    public static void main(String args[]){
        ArrayList<Integer> li= new ArrayList<>();
        li.add(1);
        li.add(2);
        li.add(3);
        li.add(4);
        li.add(5);
        for(int i=li.size()-1; i>=0; i--){
            System.out.println(li.get(i)+" ");
        }
        System.out.println();
    }
}
