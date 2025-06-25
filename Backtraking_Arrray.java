public class Backtraking_Arrray {
    public static void current(int arr[], int i,int value){
        //BASE CASE

        if(i==arr.length){
            print(arr);
            return;
        }
        arr[i]=value;
        current(arr, i+1, value+1);
        arr[i]=arr[i]-2;
    }
        public static void print(int arr[]){
            for(int i=0; i<arr.length; i++){
                System.out.println(arr[i]+" ");
            }
            System.out.println();
        
    }
    public static void main(String args[]){
        int arr[]=new int[5];
        current(arr, 0, 1);
        print(arr);
    }
}
