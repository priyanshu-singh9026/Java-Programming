public class sum_subarray {
    public static void sumSubarray(int num[]) {
        int maxSum = Integer.MIN_VALUE;
        for (int i = 0; i <= num.length; i++) {
            for (int j = i; j < num.length; j++) {
                int sum = 0;
                for (int k = i; k <= j; k++) {
                    System.out.print(num[k] + " ");
                    sum = sum + num[k];
                    
                }
                System.out.print(" = "+sum);
                System.out.println();
                if (sum > maxSum) {
                    maxSum = sum;
                }

            }
        }
        System.out.println("the maximum sum:" + maxSum);
    }

    public static void main(String args[]) {
        int num[] = { 1, 2, 3, 4, 5, 6 };
        sumSubarray(num);
    }

}
