import java.util.*;
public class set_ith_bit {
    public static int bit(int n,int i){
        int bitmask=1<<i;
       return n | bitmask;
    }
    public static void main(String args[]){
       System.out.println(bit(10, 02));
    }
    
}
