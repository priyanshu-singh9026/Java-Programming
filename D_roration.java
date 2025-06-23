public class D_roration {
    public static void rotate(int arr[],int d){
     int temp[]=new int [arr.length];
     for(int i=0; i<arr.length; i++){
        temp[(i+d)%arr.length]=arr[i];
     }
     for(int i=0; i<arr.length; i++){
     arr[i]=temp[i];
    }
}
    public static void main(String args[]){
   int arr[]={1,2,3,4,5};
   int d=3;
   rotate(arr, d);
   for(int i=0; i<arr.length; i++){
    System.out.println(arr[i]+" ");
   }
    }
}
