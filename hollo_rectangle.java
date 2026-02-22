public class hollo_rectangle {

    public static void hollo(int num1, int num2) {

 for (int i = 1; i <= num1; i++) {         
 for (int j = 1; j <= num2; j++) {      

     if (i == 1 || i == num1 || j == 1 || j == num2) {
    System.out.print("*");
     } else {
    System.out.print(" ");
    }

    }
     System.out.println();   
    }
    }

    public static void main(String[] args) {
        hollo(4, 5);
    }
}