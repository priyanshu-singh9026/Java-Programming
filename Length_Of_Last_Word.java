public class Length_Of_Last_Word {
     public static int lengthOfLastWord(String s) {
        int count = 0;
        int i = s.length() - 1;

       
        while (i >= 0 && s.charAt(i) == ' ') {
            i--;
        }

      
        while (i >= 0 && s.charAt(i) != ' ') {
            count++;
            i--;
        }

        return count;
    }

   
    public static void main(String[] args) {
        String s = "   fly me   to   the moon  ";

        int result = lengthOfLastWord(s);
        System.out.println("Length of last word = " + result);
    }
}
    
