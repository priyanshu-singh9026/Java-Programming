public class primeORnotUsingFunction {
    public static boolean isPrime(int n){
        boolean isPrime=true;
        for (int i=2; i<=n-1;i++){
            if(n%i==0){
              isPrime= false;
              break;
              //return isPrime;
            }
            
    }
    return isPrime;
    
}

public static void main (String args[]){
    boolean x=isPrime(12);
    System.out.println(x);
}
}