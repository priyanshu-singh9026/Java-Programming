import java.util.*;
public class palindromee {
    public static boolean isPalindrome(int num){
        int n =num;
        int rev =0;
        while ( n>0) {
            int b= num%10;
            rev = rev *10 + b;
            num/=10;

            
        }
        return n==rev;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        if (isPalindrome(number)){
            System.out.println("the number is palindrome:");
        }else{
            System.out.println("the number is not palindrome:");
        }
        sc.close();
    }
    
}

