import java.util.*;
public class Largest_Smallest_array {
    public static void LargestSmallest(int num[]){
        int largest = Integer.MIN_VALUE;
        int smallest =Integer.MAX_VALUE;
        for(int i=0; i<num.length; i++){
            if (largest < num[i]){
             //update
             largest = num[i];
            }if(smallest> num[i]){
                smallest=num[i];
            }
        }
    
    System.out.println("the smallest number is:"+ smallest);
    System.out.println("the largest number:" + largest);
    }
    public static void main(String args[]){
        int num[]= {1,2,3,4,56,7,8,9,10};
         LargestSmallest(num);
    }
}

