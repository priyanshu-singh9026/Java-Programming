import java.util.Arrays;

public class missing_Element {
    public static int missing(int num[]) {
        Arrays.sort(num);

        for (int i = 0; i < num.length; i++) {
            if (num[i] != i) {
                return i;
            }
        }
        return num.length;
    }

    public static void main(String args[]) {
        int num[] = {3, 0, 1};
        System.out.println(missing(num));  
    }
}


