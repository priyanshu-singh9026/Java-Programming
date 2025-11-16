public class longest_common_prifix{

    public static void prifix(String[] str) {
        String first = str[0]; 
        for (int i = 0; i < first.length(); i++) {

            char ch = first.charAt(i); 
             for (int j = 1; j < str.length; j++) {
                if (i >= str[j].length() || str[j].charAt(i) != ch) {
                      System.out.println(first.substring(0, i));
                    return;   
                }
            }
        }
        System.out.println(first);
    }

    public static void main(String[] args) {

        String[] str = {"bokyo", "bokro", "bors", "bolo"};

        prifix(str);
    }
}
