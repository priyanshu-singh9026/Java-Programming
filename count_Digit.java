import java.util.Scanner;

public class count_Digit {

    public static int countDigits(int nums[], int index) {
        if (index == nums.length) {   
            return 0;
        }
        return 1 + countDigits(nums, index + 1); 
    }

    public static void main(String args[]) {
        int nums[] = {1, 2, 3, 4};
        int result = countDigits(nums, 0);
        System.out.println("Count = " + result);
    }
}


