public class Count_sqr_sum_triple {
    public static int removeElement(int nums[], int val){
        int i = 0; 
        for(int j = 0; j < nums.length; j++){
            if(nums[j] != val){
                nums[i] = nums[j];
                i++;
            }
        }
        return i;   
    }

    public static void main(String args[]){
        int nums[] = {0,1,2,2,3,0,4,2};
        int val = 2;

        int newLength = removeElement(nums, val);
        System.out.println("New length: " + newLength);

       
        for(int k = 0; k < newLength; k++){
            System.out.print(nums[k] + " ");
        }
    }
}
