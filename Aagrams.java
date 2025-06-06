public class Aagrams {
    public static void main(String args[]){
        String str1="race";
        String str2="care";
        for( int i=0; i<str1.length(); i++ ){
            for(int j=0; j<str2.length(); j++){
                if(str1.charAt(i)==str2.charAt(j)){
               System.out.println("it is anagram");
                }else{
                    System.out.println("not anagrams");
                }
            }
        }
    }
    
}
