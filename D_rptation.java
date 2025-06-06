import java.util.*;
public class D_rptation {
    public static void DR(int arr[]){
        int D=arr.length-1;
    for(int i=0; i<arr.length; i++){
       arr[i]=D;
       arr[i+1]=arr[i];
    }
   
    }
    public static void main(String args[]){
        int arr[]={1,2,3,4,5,6,7};
        int D=3;
        DR(arr);
    }
    
}
