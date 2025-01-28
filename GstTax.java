import java.util.*;
public class GstTax {
    public static void main (String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("cost of pencil:");
        float a = sc.nextFloat();
        System.out.println("cost of pen:");
        float b = sc.nextFloat();
        System.out.println("cost of eraser:");
        float c = sc.nextFloat();
        float total = a+b+c;
        System.out.println(total);
        float totalgst= total * 0.18f;
        System.out.println(totalgst);
        
        

        sc.close();


    }
}
