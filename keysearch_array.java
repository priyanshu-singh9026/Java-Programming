import java.util.*;
public class keysearch_array {
    public static int addelement(int num[],int k){
        for(int i=0; i<num.length; i++){
            if(num[i]==k){
                System.out.println(""+num[i]);
                return i;
            }
        }
        return -1;
    }
    public static void main(String args[]){
        int num[]={2,4,6,8,10,12,14,16};
        int k=10;
       int index=addelement(num, k);
       if(index==-1){
        System.out.println("index not found"); 
       }else{
        System.out.println("index found "+index);
       }
       }
    }
    

