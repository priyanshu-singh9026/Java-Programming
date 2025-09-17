import java.util.HashSet;

public class CheckDuplicate {
    public static void main(String args[]){
        int arr[]={1,2,2,3,4,4,5};
        HashSet <Integer> set= new HashSet<>();
        boolean duplicate= false;
        for(int num : arr){
            if(!set.add(num)){
                duplicate =true;
                break;
            }
        }
        if(duplicate){
            System.out.println("duplicate found");
        }else{
            System.out.println("duplicate not found");
        }
    }
}
