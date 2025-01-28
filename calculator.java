import java.util.*;

public class calculator {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        
        // Input first number
        System.out.println("Enter a:");
        int a = sc.nextInt();
        
        // Input second number
        System.out.println("Enter b:");
        int b = sc.nextInt();
        
        // Input operator
        System.out.println("Enter operator:");
        char operator = sc.next().charAt(0);

        // Perform operation based on the operator
        switch (operator) {
            case '+':
                System.out.println("Result: " + (a + b));
                break;
            case '-':
                System.out.println("Result: " + (a - b));
                break;
            case '/':
                if (b != 0) {
                    System.out.println("Result: " + (a / b));
                } else {
                    System.out.println("Division by zero is not allowed.");
                }
                break;
            case '*':
                System.out.println("Result: " + (a * b));
                break;
            case '%':
                if (b != 0) {
                    System.out.println("Result: " + (a % b));
                } else {
                    System.out.println("Division by zero is not allowed.");
                }
                break;
            default:
                System.out.println("Wrong operator");
        }
        
        sc.close();
    }
}