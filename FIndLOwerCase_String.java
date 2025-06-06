public class FIndLOwerCase_String {
    public static boolean lower(String str){
        
       String lower = str.toLowerCase().replaceAll("[^a-z0-9]", "");
      int n= lower.length();
      for(int i=0; i<n/2; i++){
        if(lower.charAt(i) != lower.charAt(n-i-1)){
            return false;
        }
      }
      return true;

     }
    public static void main(String args[]){
       boolean result = lower("A man, a plan, a canal: Panama");
        System.out.println("Is palindrome: " + result);
    }
    
}
