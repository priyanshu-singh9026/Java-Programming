public class Elements_Divisible_By_three {

    public int minimumOperations(int[] nums) {
        int res = 0;

        for (int i = 0; i < nums.length; i++) {
            int rem = nums[i] % 3;

            if (rem == 1) {
                res += 1;
            } else if (rem == 2) {
                res += 1;
            }
        }

        return res;
    }

    public static void main(String[] args) {

        int nums[] = {1, 2, 3, 4};

        Elements_Divisible_By_three obj = new Elements_Divisible_By_three();
        int ans = obj.minimumOperations(nums);

        System.out.println(ans); // Output: 3
    }
}
