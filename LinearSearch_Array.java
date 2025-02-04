public class LinearSearch_Array {
    public static int LinearSearch(int num[], int key){
        for (int i=0; i<num.length; i++){
            if (num[i]==key){
                return i;
            }
        }
        return -1;
    }
    public static void main(String args[]){
        int num[]={1,2,3,4,5,6,7,8,9,10,11,12,13};
        int key = 20;
        int index = LinearSearch(num , key);
        if(index==-1){
          System.out.println("not found");
        }else{
            System.out.println("the index number is:"+ index);
        }

}    }
    
    

