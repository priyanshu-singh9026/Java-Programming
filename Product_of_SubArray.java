public class Product_of_SubArray {
    public static int[] product(int[] nums) {

        int[] result = new int[nums.length];

        for (int i = 0; i < nums.length; i++) {
            int product = 1;  

            for (int j = 0; j < nums.length; j++) {
                if (i != j) {      
                    product *= nums[j];
                }
            }

            result[i] = product;
        }

        return result;
    }
    public static void main(String args[]){
        int num[]={1,2,3,4};
        int[] result2=product(num);
        for(int i=0; i<result2.length; i++){
            System.out.println(result2[i]);
        }
    }
}

    

