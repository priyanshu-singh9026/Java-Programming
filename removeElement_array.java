public class removeElement_array {
    public static int  remove(int num[],int k) {
        int count=0;
        for(int i=0; i<num.length; i++){
          if(num[i] != k){
            num[count]=num[i];
            count++;
          }
        }
        return count;
    }
    public static void main(String args[]){
        int num[]={1,1,2,3,4};
        int k=1;

        int res=remove(num, k);
        for(int i=0; i<res; i++){
            System.out.println(num[i] +" ");
        }
    }
    
}
