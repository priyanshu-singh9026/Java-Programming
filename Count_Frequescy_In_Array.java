import java.util.HashMap;

public class Count_Frequescy_In_Array {

    public static void frequescy(int nums[]) {

        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(nums[i])) {
                map.put(nums[i], map.get(nums[i]) + 1);
            } else {
                map.put(nums[i], 1);   
            }
        }

       
        System.out.println(map);
    }

    public static void main(String args[]) {
        int nums[] = {1, 2, 2, 3, 3, 5};
        frequescy(nums);
    }
}
