import java.util.*;
public class Get_ith_bit {
    public static int ithbit(int n ,int i){
        int bitmask=1<<i;
        if ((n&bitmask)==0){
            return 0;
        }else{
            return 1;
        }
    }
        public static void main(String args[]){
            System.out.println(ithbit(10,2));
            System.out.println(ithbit(8,3));
            System.out.println(ithbit(9,2));
            System.out.println(ithbit(6,5));
            System.out.println(ithbit(7,7));
        }
    }

    

