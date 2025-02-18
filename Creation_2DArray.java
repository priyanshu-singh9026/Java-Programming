import java.util.*;
public class Creation_2DArray {
    public static boolean search (int matrices[][] , int key){
        for (int i=0; i<matrices.length; i++){
            for (int j=0; j<matrices[0].length; j++){
               if (matrices[i][j]==key){
                System.out.println("Found the cell (" + i + "," + j + ")");
                return true;
               }
            }
        }
        return false;
    }
    public static void main(String args[]){
        int martrices[][]=new int [3][3];
        int n = martrices.length , m = martrices[0].length;
        Scanner sc =new Scanner(System.in);
        System.out.println("enter the number of 3*3 matrices:");
        for (int i=0; i<n; i++){
            for (int j=0; j<m; j++){
                martrices[i][j]=sc.nextInt();
            }
        }
        //output
        System.out.println("the matrices");
        for (int i=0; i<n; i++){
            for (int j=0; j<m; j++){
            System.out.print(martrices[i][j] + " ");
                
    }
    System.out.println();
    
}
search(martrices,5);
sc.close();
}
}