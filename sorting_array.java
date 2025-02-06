public class sorting_array {
    public static void sort (int num[]){
    int count=0;
    for (int i=0; i<=num.length-1; i++){
        
            if (num[i]<num[i]+1){
              int temp=num[i];
              num[i]=temp;
            }
        }
       
    }
    
}

