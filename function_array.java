public class function_array {
    public static void update(int maks[]){
        for(int i=0; i<maks.length; i++){
            maks[i]=maks[i]+1;

        }
    }
    public static void main(String args[]){
        int maks[]={15,16,17};
        update(maks);
       for(int i=0; i<maks.length; i++){
        System.out.println(""+maks[i]);
       }
    }
    
}
