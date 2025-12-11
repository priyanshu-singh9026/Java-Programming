class Find_Minimum_In_Roated_Sorted_Array {

    public static int rotated(int nums[]) {
        int left = 0; 
        int right = nums.length - 1;

        while (left < right) {
            int mid = (left + right) / 2;

            if (nums[mid] > nums[right]) {
                left = mid + 1;
            } else {
                right = mid;
            }
        }
        return nums[left];
    }

    public static void main(String args[]) {
        int nums[] = {11, 13, 15, 17};
        int result = rotated(nums);
        System.out.println(result);
    }
}
