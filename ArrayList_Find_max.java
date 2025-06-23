import java.util.*;
public class ArrayList_Find_max {
    public static void main(String args[]){
        ArrayList<Integer> li=new ArrayList<>();
        
        li.add(2);
        li.add(5);
        li.add(9);
        li.add(3);
        li.add(6);
int max=Integer.MIN_VALUE;
for(int i=0; i<li.size(); i++){
    if(max<li.get(i)){
max=li.get(i);
    }
}
System.out.println("the maximum is:"+max);
    }
}
