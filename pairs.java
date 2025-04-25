import java.util.*;
public class pairs {
    public static void subarray(int num[]){
        for(int i=0; i<num.length; i++){
            int count=num[i];
            for(int j=i+1; j<num.length; j++){
             System.out.println("("+count+","+num[j]+")");
            }
        }
    }
    public static void main(String args[]){
        int num[]={1,2,3,4,5};
        subarray(num);
    }
    
}
