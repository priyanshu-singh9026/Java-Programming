public class maximum_product0fSubarray {
    public static int maximum(int nums[]){
        int max=Integer.MIN_VALUE;
        for(int i=0; i<nums.length; i++){
            int product=1;
            for(int j=i; j<nums.length; j++){
                product *= nums[j];
                if(product >max){
                    max=product;
                }
            }
           
            
    }
     return max;
        }
            public static void main(String args[]){
                int nums[]={1,2,3,4,5};
               int result = maximum(nums);
        System.out.println("Maximum Product of Subarray: " + result);
            }
    
}
