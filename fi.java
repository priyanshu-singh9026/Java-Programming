import java.util.*;

public class fi {
    public static void Equilibrium(int num[]) {
        int rightsum = 0, leftSum =0;
        for (int i = 0; i < num.length; i++) {
            rightsum += num[i];
        }
        for (int i = 0; i < num.length; i++) {
            rightsum=rightsum-num[i];  
            
            if (leftSum == rightsum) {
                System.out.println("Equilibrium index found at: " + i);
                return; 
            }
            
            leftSum += num[i];
        }
        System.out.println("No Equilibrium index found");
    }

    public static void main(String args[]) {
        int num[] = {2, 3, -1, 8, 4};
        Equilibrium(num);
    }
}