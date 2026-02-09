import java.util.HashMap;
import java.util.Scanner;

public class HASHMAP_Remove_duplicate {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int n=sc.nextInt();
        HashMap <Integer,Integer> map= new HashMap<>();
        System.out.println("enter number");
        for(int i=0; i<n; i++){
            int num=sc.nextInt();
        
        if(map.containsKey(num)){
            map.put(num, map.get(num)+1);
        }else{
            map.put(num,1);
        }
        }
      for (int key : map.keySet()) {
            System.out.println(key + " " + map.get(key));
    }
    
}
}
