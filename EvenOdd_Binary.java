import java.util.*;
public class EvenOdd_Binary {
    public static void evenodd(int n){
        int Bitmask=1;
        if((n &Bitmask)==0){
       System.out.println("even number");
        }else{
            System.out.println("odd number");
        }
    }
    public static void main(String args[]){
      evenodd(3);
      evenodd(4);
    }
    
}
