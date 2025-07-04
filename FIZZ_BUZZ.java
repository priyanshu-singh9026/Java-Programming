import java.util.ArrayList;
import java.util.List;

public class FIZZ_BUZZ {

    public static List<String> fizzBuzz(int n) {
        List<String> result = new ArrayList<>();

        for (int i = 1; i <= n; i++) {
            if (i % 3 == 0 && i % 5 == 0) result.add("FizzBuzz");
            else if (i % 3 == 0) result.add("Fizz");
            else if (i % 5 == 0) result.add("Buzz");
            else result.add(String.valueOf(i));
        }

        return result;
    }

    public static void main(String[] args) {
        int n = 15; // you can change this number
        List<String> output = fizzBuzz(n);

        for (String s : output) {
            System.out.println(s);
        }
    }
}
