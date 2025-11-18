import java.util.Arrays;

public class Valid_Anagram {
    public static boolean Anagram(String s,String t){
        char arr[]=s.toCharArray();
        char arr2[]=t.toCharArray();
        
        Arrays.sort(arr);
        Arrays.sort(arr2);
        for(int i=0; i<arr.length; i++){
            if(arr[i] != arr2[i]){
                return false;
            }
        }
        return true;
    }
    public static void main(String args[]){
        String s="priyanshu";
        String t="priyanshu";
        boolean ans = Anagram(s, t);
        System.out.println(ans);
    }
    
}
