public class Inverted_Number_Pyramid {
    public static void PyramidNum(int n){
        for (int i=5; i>=1; i--){
            for (int j=1; j<=i; j++){
                System.out.print(i);
            }
            System.out.print("\n");
        }
    }
    public static void main(String args[]){
          PyramidNum(5);
    }
    
}
