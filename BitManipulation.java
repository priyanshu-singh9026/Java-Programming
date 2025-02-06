import java.util.*;

public class BitManipulation {
    public static void bit_manipulation(int num[]) {
        Arrays.sort(num);  

        int count0 = 0;
        int count1 = 0;
        int count2 = 0;

        
        for(int i = 0; i < num.length; i++) {  
            if(num[i] == 0) {
                count0++;
            } else if (num[i] == 1) {
                count1++;
            } else if(num[i] == 2) {
                count2++;
            }
        }

        
        System.out.print("Sorted Array: ");
        for (int i = 0; i < num.length; i++) {
            System.out.print(num[i] + " ");
        }
        System.out.println();  

    
        System.out.println("Count of 0s: " + count0);
        System.out.println("Count of 1s: " + count1);
        System.out.println("Count of 2s: " + count2);
    }

    public static void main(String args[]) {
        int num[] = {0, 1, 0, 0, 0, 1, 2, 2, 2};
        bit_manipulation(num);
    }
}