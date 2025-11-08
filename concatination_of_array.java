public class concatination_of_array {
    public static int[] concatinate(int num[]) {
        int n = num.length;
        int arr[] = new int[2 * n];
        for (int i = 0; i<n; i++) {
            arr[i] = num[i];
            arr[i+n] = num[i];
        }
        return arr;
    }

    public static void main(String args[]) {
        int num[] = {1, 2, 3, 4};
        int result[] = concatinate(num);

        for (int x = 0; x<result.length; x++) {
            System.out.print(result[x] + " ");
        }
    }
}
