import java.util.*;
public class frequencyOFarray {
    public static void main(String args[]){
        Scanner sc= new Scanner (System.in);
        System.out.println("enter the size of array:");
        int n=sc.nextInt();
        int arr[]=new int[n];
        System.out.println("enter your array element:");
        for(int i=0; i<n; i++){
            arr[i]=sc.nextInt();
        }
        for(int i=0; i<n; i++){
            for(int j=i+1; j<n; j++){
                if(arr[i]==arr[j]){
                    System.out.println("the element is:"+arr[j]+" "+"the index is:"+arr[i]);
                }
            }
            sc.close();
        }
    }
}
