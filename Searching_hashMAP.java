import java.util.*;
public class Searching_hashMAP {
    public static void main(String args[]){
        HashMap<String, Integer> map=new HashMap<>();

        map.put("india", 100);
        map.put("china", 200);
        map.put("bangladesh", 00);

        if(map.containsKey("china")){
            System.out.println("key is exists");
        }else{
            System.out.println("key is not exists");
        }
      System.out.println(map.get("china"));//print values
    }
}
