import java.util.*;

public class reverseTRY {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        
        System.out.print("Enter size of array: ");
        int n = sc.nextInt(); 

        int arr[] = new int[n];

        System.out.println("Enter your array elements");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();  
        }

       
        int start = 0;
        int end = n - 1;

        while (start < end) {
            
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;

           
            start++;
            end--;
        }

        for(int i=0; i<n; i++){
            System.out.print(arr[i]+" ");
        }
       sc.close();
        }

       
       
    }
