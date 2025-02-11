public class Pyramid_Alphabates {
    public static void Alphabates(int n){
        for (int i =0; i<n; i++){
            for (int j=0; j<n-i-1; j++){
                System.out.print(" ");
            }
            char ch='A';
            for (int j=0; j<=i; j++){
                System.out.print(ch);
                ch++;
            }
            ch -= 2;
            for (int k = 0; k < i; k++) {
                System.out.print(ch);
                ch--;
            }
            System.out.println();
        }
        
    }
    public static void main(String args[]) {
        Alphabates(5);
    }
    
}
