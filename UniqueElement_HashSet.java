import java.util.HashSet;
public class UniqueElement_HashSet {
    public static void main(String args[]){
        int arr[]={1,2,2,3,4,4,5};
        HashSet<Integer> set=new HashSet<>();
        HashSet<Integer> duplicate=new HashSet<>();
        for(int num: arr){
            if(!set.add(num)){
                duplicate.add(num);
            }
        }
        set.removeAll(duplicate);
        System.out.println(set);

    }
}
