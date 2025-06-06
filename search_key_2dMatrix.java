import java.util.*;
public class search_key_2dMatrix {
    public static boolean search(int num[][],int key){
        for(int i=0; i<num.length; i++){
            for(int j=0; j<num[0].length; j++){
                if(num[i][j]==key){
                    System.out.println("element found ("+i+","+j+")");
                    return true;
                }
            }
        }
        return false;
    }
    public static void main(String args[]){
      int num[][]=new int[3][3];
      Scanner sc =new Scanner(System.in);
      for(int i=0; i<num.length; i++){
        for(int j=0; j<num[0].length; j++){
            num[i][j]=sc.nextInt();
        }
      }
      for(int i=0; i<num.length; i++){
        for(int j=0; j<num[0].length; j++){
            System.out.print(num[i][j]+" ");
        }
        System.out.println();
      }
      search(num, 5);
    }
    
}
