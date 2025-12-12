import java.util.HashSet;

public class Pair_Sum_In_Sorted_And_Roated_Array {
    public static boolean Search(int arr[], int target){
        HashSet<Integer> set = new HashSet<>();

        for(int i=0; i<arr.length; i++){
            int req = target - arr[i];

            if(set.contains(req)){
                return true;
            } else {
                set.add(arr[i]);
            }
        }

        return false;
    }

    public static void main(String[] args) {
        int arr[]={7, 9, 1, 3, 5};
        int target=6;

        boolean result = Search(arr, target);
        System.out.println(result);
    }
}
