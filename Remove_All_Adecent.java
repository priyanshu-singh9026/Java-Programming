public class Remove_All_Adecent {

    public String removeDuplicates(String s) {
        StringBuilder sb = new StringBuilder();
        
        for (int i = 0; i < s.length(); i++) {
            if (sb.length() > 0 && sb.charAt(sb.length() - 1) == s.charAt(i)) {
                sb.deleteCharAt(sb.length() - 1);   
            } else {
                sb.append(s.charAt(i));         
            }
        }

        return sb.toString();   
    }

    public static void main(String[] args) {
        String s = "abbaca";

        Remove_All_Adecent obj = new Remove_All_Adecent();
        String result = obj.removeDuplicates(s);

        System.out.println(result);  
    }
}
