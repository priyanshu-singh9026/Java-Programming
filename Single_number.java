import java.util.*;
public class Single_number {
    public static void main(String args[]){
        Scanner sc= new Scanner (System.in);
        System.out.println("enter the size of array:");
        int n=sc.nextInt();
        int arr[]=new int[n];
        System.out.println("enter the array element: ");
        for(int i=0; i<n; i++){
            arr[i]=sc.nextInt();
           
        }
        for(int i=0; i<n; i++){
            int count=0; 
            for(int j=0; j<n; j++){
                if(arr[i]==arr[j]){
                    count++;
                }
            }
           
            if(count==1){
                System.out.println("single number is:"+arr[i]);
                break;
            }
           
        }
         sc.close();
    }
}
