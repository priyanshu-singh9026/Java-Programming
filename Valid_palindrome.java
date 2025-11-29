public class Valid_palindrome {

    public static boolean palindrome(String s) {

        String str = s.toLowerCase().replaceAll("[^a-z0-9]", "");
        int n = str.length();

        for(int i = 0; i < n / 2; i++) {
            if(str.charAt(i) != str.charAt(n - i - 1)) {
                return false;
            }
        }
        return true;
    }

    public static void main(String args[]) {

        String s = "A man, a plan, a canal: Panama";

        boolean result = palindrome(s); 

        System.out.println(result);     
    }
}
