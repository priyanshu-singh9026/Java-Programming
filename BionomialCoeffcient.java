public class BionomialCoeffcient {
    public static int factorial (int n){
        int fact =1;
        for (int i=1; i<=n; i++){
            fact =fact*i;
        }
        return fact;
    }  
    public static int biocoeff(int n, int r){
        int fact_n = factorial(n);
        int fact_r = factorial(r);
        int fact_nmr = factorial(n-r);
        int biocoeff = fact_n / (fact_r*fact_nmr);
        return biocoeff;
    }
    public static void main(String arg[]){
        System.out.println(biocoeff (7,5));
    }
}
