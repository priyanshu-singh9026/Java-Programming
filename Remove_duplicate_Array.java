public class Remove_duplicate_Array {
    public static void duplicate (int num[]){
        for (int i=0; i<num.length; i++){
            for (int j=i+1; j<num.length; j++){
             if (num[i]==num[j]){
                System.out.println("duplicate number is:"+num[i]);
                
             }
            }
            
        }
    }
    public static void main(String args[]){
        int num[]= {1,1,2,2,3,3,4,4,5,5};
        duplicate(num);
    }
    
}
