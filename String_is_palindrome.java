public class String_is_palindrome {
    public static boolean palindrome(String str) {
        int n = str.length(); // Move outside loop
        for (int i = 0; i < n / 2; i++) {
            if (str.charAt(i) != str.charAt(n - 1 - i)) {
                return false;
            }
        }
        return true;
    }

    public static void main(String args[]) {
        String str = "racecar";
        System.out.println(palindrome(str)); 
    }
}