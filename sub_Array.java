public class sub_Array {
    public static void subarray(int num[]) {
        for(int i = 0; i < num.length; i++) {
            for(int j = i; j < num.length; j++) {
                System.out.print("[ ");
                for(int k = i; k <= j; k++) {
                    System.out.print(num[k] + " ");
                }
                System.out.println("]");
            }
        }
    }

    public static void main(String[] args) {
        int num[] = {1, 1, 1, 1};
        subarray(num);
    }
}
