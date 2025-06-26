public class pattern_for_number {
    public static void pattern(int num) {
        int n = num;
        for (int i = n; i >= 1; i--) {
            for (int j = 1; j < i; j++) {
                System.out.print("  ");
            }

            for (int k = i; k <= n; k++) {
                System.out.print(k + " ");
            }

            System.out.println();
        }
        for (int i = 2; i <= n; i++) {
            for (int j = 1; j < i; j++) {
                System.out.print("  ");
            }
            for (int k = i; k <= n; k++) {
                System.out.print(k + " ");
            }

            System.out.println();
        }
    }

    public static void main(String args[]) {
        int num = 5;
        pattern(num);
    }
}
