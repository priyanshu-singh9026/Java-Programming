import java.util.*;

public class monotonic_arrayList {

    public static boolean check(ArrayList<Integer> mono) {
        boolean increasing = true;
        boolean decreasing = true;

        for (int i = 0; i < mono.size() - 1; i++) {
            if (mono.get(i) > mono.get(i + 1)) {
                increasing = false;
            }
            if (mono.get(i) < mono.get(i + 1)) {
                decreasing = false;
            }
        }

        return increasing || decreasing;
    }

    public static void main(String args[]) {
        ArrayList<Integer> mono = new ArrayList<>();
        mono.add(1);
        mono.add(2);
        mono.add(2);
        mono.add(3);

        System.out.println("Is Monotonic: " + check(mono));
    }
}
