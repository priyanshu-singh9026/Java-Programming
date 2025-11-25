public class MINIMUM_ELEMENT_ARR {
    public static int Min(int num[], int idx){
        if(idx==num.length-1){
            return num[idx];
        }
            int min=Min(num, idx+1);
            return Math.min(num[idx], min);
        }
        public static void main(String[] args) {
        int num[] = {5, 9, 2, 7, 1};
        System.out.println(Min(num, 0));
    }
    }
    

