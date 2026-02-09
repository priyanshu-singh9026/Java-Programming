public class Product_of_Array_accept_itself {

    public static int[] product(int num[]) {
        int result[] = new int[num.length];

        for (int i = 0; i < num.length; i++) {
            int mul = 1;

            for (int j = 0; j < num.length; j++) {
                if (i != j) {
                    mul *= num[j];
                }
      }
            result[i] = mul;
        }
        return result;
    }

    public static void main(String args[]) {
        int num[] = {1, 2, 3, 4};
        int[] res2 = product(num);

        for (int i = 0; i < res2.length; i++) {
            System.out.println(res2[i]);
        }
    }
}
