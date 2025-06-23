
import java.util.ArrayList;

public class ArrayLi_SWAP {
    public static void swap(ArrayList<Integer> li,int idx1,int idx2){
   int temp= li.get(idx1);
   li.set(idx1, li.get(idx2));
   li.set(idx2, temp);
    }
public static void main(String args[]){
        ArrayList<Integer> li=new ArrayList<>();
        
        li.add(2);
        li.add(5);
        li.add(9);
        li.add(3);
        li.add(6);
        
    int idx1=1, idx2=3;
    System.out.println(li);
    swap(li, idx1, idx2);
    System.out.println(li);
}
}