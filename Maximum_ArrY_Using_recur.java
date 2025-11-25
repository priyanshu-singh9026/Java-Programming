public class Maximum_ArrY_Using_recur {

    public static int findMax(int arr[], int index) {

        if (index == arr.length - 1) {
            return arr[index];
        }

        int max = findMax(arr, index + 1);

        return Math.max(arr[index], max);
    }

    public static void main(String[] args) {
        int arr[] = {5, 9, 2, 7, 1};
        System.out.println(findMax(arr, 0));
    }
}
