public class decreasingN_RECURSION {
    public static void decrease(int n){
        if(n==0){
            return;
        }
        System.out.println(n);
        decrease(n-1);
       
        

    }
    public static void main(String args[]){
        decrease(5);
    }
    
}
