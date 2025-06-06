public class sumOFn_natural_recursion {
    public static int sum(int n){
    if(n==1){
        return 1;
    }
    int snm1=sum(n-1);
    int snm2=n+snm1;
    return snm2;
    
}
public static void main(String args[]){
    int n=5;
    System.out.println(sum(n));
}
}