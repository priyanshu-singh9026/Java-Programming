public class left_rotate_array {
    public static void rotate(int nums[]){
       int temp=nums[0];
       for(int i=0; i<nums.length-1; i++){
        nums[i]=nums[i+1];
       }
      nums[nums.length-1]=temp;
      for(int i=0; i<nums.length; i++){
        System.out.println(nums[i]+" ");
      }
    }
    public static void main(String args[]){
        int nums[]={1,2,3,4,5,6};
        rotate(nums);
    }
}
