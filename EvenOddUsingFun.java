import java.util.*;
public class EvenOddUsingFun {
    public static void main(String args[]){
        Scanner sc = new Scanner (System.in);
        int num;
        System.out.println("enter the number:");
        num= sc.nextInt();
        if(isEven(num)){
            System.out.println("the number is enen");
        } else{
            System.out.println("the number is odd:");
            sc.close();
        }
    }
    public static boolean isEven(int number){
        if (number % 2==0){
            return true;

        }else{
            return false;
        }
    }

    
}
