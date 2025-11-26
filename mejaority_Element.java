import java.util.Arrays;

public class mejaority_Element {

    public static void majority(int num[]) {
        Arrays.sort(num);
         int result = num[num.length / 2];
          System.out.println("Majority Element: " + result);
    }

    public static void main(String args[]) {
        int num[] = {2, 2, 1, 1, 1, 2, 2};
        majority(num);
    }
}
