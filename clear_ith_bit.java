import java.util.*;
public class clear_ith_bit {
    public static int Ibit(int n, int i){
        int bitmask=~(1<<i);
        return n&bitmask;
    }
    public static void main(String args[]){
        System.out.println(Ibit(10, 1));
    }
    
}
