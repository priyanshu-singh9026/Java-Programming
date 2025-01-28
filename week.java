import java.util.*;
public class week {
    public static void main(String args[]){
        Scanner sc = new Scanner (System.in);
        System.out.println("enter the number of  week");
        int week = sc.nextInt();
        switch(week){
            case 1 :System.out.println("today is monday");
            break;
            case 2: System.out.println("today is tuesday");
            break;
            case 3: System.out.println("today is wed");
            break ;
            case 4: System.out.println("today is thursday");
            break;
            case 5: System.out.println("today is friday");
            break ;
            case 6: System.out.println("today is saturday");
            break;
            case 7: System.out.println("today is sunday");
            break;
            default:
            System.out.println("invalid number");
        }
        sc.close();

    }
    
}
