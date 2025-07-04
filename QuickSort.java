public class QuickSort {
    public static void printArr(int num[]){
        for(int i=0; i<num.length; i++){
            System.out.println(num[i]+" ");
        }
        System.out.println();
    }
    public static void quicksort(int num[], int si, int ei){
        if(si>=ei){
            return;
        }
         //last element
          int pIdx= partition(num, si, ei);
          quicksort(num, si, pIdx-1);//left
          quicksort(num, pIdx+1, ei);
    }
    public static int partition(int num[], int si, int ei){
        int pivot=num[ei];
        int i= si-1;
        for(int j=si; j<ei; j++){
            if(num[j] <= pivot){
                i++;
                int temp= num[j];
                num[j]=num[i];
                num[i]=temp;
                
            }
        }
        i++;
        int temp= pivot;
        num[ei]= num[i];
        num[i]=temp;
return i;
    }
    public static void main(String[] args) {
        int num[]={6,3,9,8,2,5};
        quicksort(num, 0, num.length-1);
        printArr(num);
    }
    
}
