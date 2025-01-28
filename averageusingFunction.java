import java.util.*;
public class averageusingFunction {
    public static void main(String args[]){
        Scanner sc = new Scanner (System.in);
        System.out.println("enter the first number:");
        double x = sc.nextDouble();
        System.out.println("enter the second number:");
        double y = sc.nextDouble();
        System.out.println("enter the third number:");
        double z = sc.nextDouble();
        System.out.println("the average of" + average(x,y,z)+"\n");
        sc.close();
    }
    public static double average (double x,double y,double z) {
        return (x+y+z)/3;
        
        
    }
    
    
}
