public class insertion_sort {
    public static void insersort(int arr[]){
        for (int i=1; i<arr.length; i++){
            int current=arr[i];
            int previous= i-1;
            while (previous>=0 && arr[previous] > current) {
                arr[previous+1]=arr[previous];
                previous--;
            }
            arr[previous+1]=current;
        }
    }
    public static void Printarr(int arr[]){
        for(int i=0; i<arr.length; i++){
            System.out.println(arr[i]+" ");
        }
        System.out.println();
    }
   
    public static void main(String[] args) {
        int arr[]={5,4,1,3,2};
        insersort(arr);
        Printarr(arr);
    }
    
}
