public class twoSum_array {
    public static void twosum(int num[]){
      int  target=9;
        for(int i=0; i<num.length; i++){
            int sum=0;
            for(int j=i; j<num.length; j++){
                sum+=num[j];
               if(sum==target){
                System.out.print("Subarray found from index " + i + " to "+j+": ");
           for(int k=i; k<=j; k++){
            System.out.println(num[k]+"");
           }
           System.out.println();
        }
    }
}
    }
    public static void main(String args[]){
        int num[]={1,2,3,4,5,6,7};
        twosum(num);
    }
    
}
