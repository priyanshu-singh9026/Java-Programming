public class SubsString {
    public static String subs(String str, int start, int end){
        String subs =" ";
        for(int i=start; i<=end; i++){
            subs += str.charAt(i);
        }
        return subs;
    }
    public static void main(String args[]){
        String str="helloworld";
        System.out.println(subs(str, 0, 5));
    }
    
}
