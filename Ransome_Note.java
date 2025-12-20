
import java.util.HashMap;

public class Ransome_Note {

    static void increase(HashMap<Character, Integer> map, char ch) {
        if (map.containsKey(ch)) {
            map.put(ch, map.get(ch) + 1);
        } else {
            map.put(ch, 1);
        }
    }

    public static void main(String[] args) {
        HashMap<Character, Integer> map = new HashMap<>();

        String magazine = "aab";

        for (int i = 0; i < magazine.length(); i++) {
            increase(map, magazine.charAt(i));
        }

        System.out.println(map); // {a=2, b=1}
    }
}
