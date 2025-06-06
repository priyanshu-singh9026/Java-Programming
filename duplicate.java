import java.util.*;
public class duplicate {

    public static void main(String[] args) {
        int num[] = { 0, 1, 1, 2, 2, 3, 4, 5, 6 , 6};
        int n=num.length;

        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                if(num[i]==num[j]){
                    
                }
            }
        }

        System.out.print(Arrays.toString(num));
    }
}
