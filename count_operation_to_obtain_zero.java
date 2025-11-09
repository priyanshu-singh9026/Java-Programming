public class count_operation_to_obtain_zero {

    public static int count(int num1, int num2){
        int count = 0;

        while(num1 > 0 && num2 > 0){
            if(num1 >= num2){
                num1 = num1 - num2;
            }else{
                num2 = num2 - num1;  
            }
            count++;
        }
        return count;
    }

    public static void main(String args[]){
        System.out.println(count(2, 3));  
}

}