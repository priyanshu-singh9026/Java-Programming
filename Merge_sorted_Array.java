public class Merge_sorted_Array {
    public static void merge(int num1[], int n, int num2[], int m) {

        int i = n - 1;
        int j = m - 1;
        int k = n + m - 1;

        while (i >= 0 && j >= 0) {
            if (num1[i] > num2[j]) {
                num1[k] = num1[i];
                i--;
            } else {
                num1[k] = num2[j];
                j--;
            }
            k--;
        }

        while (j >= 0) {
            num1[k] = num2[j];
            j--;
            k--;
        }
    }

    public static void main(String args[]) {
        int num1[] = {1, 2, 3, 0, 0, 0};
        int num2[] = {2, 5, 6};
        int n = 3;
        int m = 3;

        merge(num1, n, num2, m);

        for (int x : num1) {
            System.out.print(x + " ");
        }
    }
}
