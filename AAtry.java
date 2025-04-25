import java.util.*;
public class AAtry {
    public static void subarray(int num[]){
        for(int i=0; i<num.length; i++){
            for(int j=i; j<num.length; j++){
                int sum=0;
             for(int k=i; k<=j; k++){
                System.out.print(num[k]+" ");
                sum+=num[k];
            }
             System.out.println("="+sum);
             
            }
        }
    }
    public static void main(String args[]){
        int num[]={1,2,3,4,5};
        subarray(num);
    }
}
