
public class kadanes_Subarray {
    public static void kadaneSubA(int num[]){
        int maxSum=Integer.MIN_VALUE;
        int current =0;
        for(int i=0; i<=num.length; i++){
            current=current+1;
            if(current<0){
                current=0;
            }
            maxSum=Math.max(current,maxSum);
        }
        System.out.println("the maximum subarray sum is:"+ maxSum);
    }
    public static void main(String args[]){
        int num[]= {-2,-3,4,-1,-2,1,5,-3};
        kadaneSubA(num);
    }
    
}
