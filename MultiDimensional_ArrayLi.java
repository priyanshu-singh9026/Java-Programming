
import java.util.*;
public class MultiDimensional_ArrayLi {
    public static void main(String args[]){
    ArrayList <ArrayList<Integer>> main=new ArrayList<>();
    ArrayList <Integer> List1=new ArrayList<>();
    ArrayList <Integer> List2=new ArrayList<>();
    ArrayList <Integer> List3=new ArrayList<>();
    for(int i=0; i<5; i++){
        List1.add(i*1);
        List2.add(i*2);
        List3.add(i*3);

    }
    main.add(List1);
    main.add(List2);
    main.add(List3);
    System.out.println(main+" ");
  for(int i=0; i<main.size(); i++){
    ArrayList <Integer> currentlist= main.get(i);
    for(int j=0; j<currentlist.size(); j++){
        System.out.print(currentlist.get(j)+" ");
    }
    System.out.println();
  }
   
    
    }
    
}
