public class MAX_SUBARRAY {
    public static void maxSubArray(int num[]){
        int sum=0;
        for(int i=0; i<=num.length; i++){
            sum=sum+num[i];
            System.out.println(" "+num[i]);
        }
    }
    public static void main(String args[]){
        int num[]= {1,-2,6,-1,3};
        maxSubArray(num);
    }
    
}
