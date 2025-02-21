public class Number_Pattern {
    public static void PatternNum(int n){
        for (int i=1; i<=n; i++){
            for (int j=1; j<=i; j++){
                System.out.print(j);
            }
            System.out.print("\n");
        }
    }
    public static void main(String[] args) {
        PatternNum(5);
    }
    
}
