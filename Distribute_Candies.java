import java.util.*;

public class Distribute_Candies {
    public static int candies(int num[]) {
        HashSet<Integer> h1 = new HashSet<>();
        for (int candy : num) {
            h1.add(candy);
        }
        int length = h1.size();      
        int limit = num.length / 2;  
        return Math.min(length, limit);
    }

    public static void main(String args[]) {
        int num[] = {1, 1, 2, 2, 3, 3};
        System.out.println(candies(num)); 
    }
}
