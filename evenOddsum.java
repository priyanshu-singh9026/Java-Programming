import java.util.Scanner;

public class evenOddsum {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Total number:");
        int n=sc.nextInt();
        int number;
        int evenSum = 0;
        int oddSum = 0;
        System.out.println("Enter your number:");
        for(int i=1; i<=n;i++){
            number = sc.nextInt();

            if (number % 2 == 0) {
                evenSum += number; // Add to evenSum if even
            } else {
                oddSum += number; // Add to oddSum if odd
            }
        }

        System.out.println("Sum of even numbers: " + evenSum);
        System.out.println("Sum of odd numbers: " + oddSum);
        sc.close();
    }
}
