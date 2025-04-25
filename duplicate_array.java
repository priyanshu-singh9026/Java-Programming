public class duplicate_array {
    public static void duplicate(int num[]){
        for (int i=0; i<=num.length; i++){
            for(int j=i+1; j<num.length; j++){
            if (num[i]==num[j]){
                System.out.println(num[i]);
                break;
            }
         
            }
           
        }
    }
    public static void main (String args[]){
        int num[]= {1,1,2,2,3,34,4,5,5};
        duplicate(num);
    }
    
}
