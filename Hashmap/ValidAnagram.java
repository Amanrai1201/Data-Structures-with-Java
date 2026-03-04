import java.util.HashMap;
import java.util.Set;

public class ValidAnagram {
    public static boolean validAnagram(String s, String t) {
        HashMap<Character, Integer> map = new HashMap<>();
        if (s.length() != t.length()) {
            return false;
        }
        // String main = s + t;
        // for (int i = 0; i < main.length(); i++) {
        // char val = main.charAt(i);
        // if (map.containsKey(val)) {
        // map.put(val, map.get(val) + 1);
        // } else {
        // map.put(val, 1);
        // }
        // }

        // Set<Character> values = map.keySet();
        // // System.err.println(keys);
        // for (Character key : values) {
        // if ((map.get(key) % 2) != 0) {
        // return false;
        // }
        // // System.out.println(key);
        // }
        // return true;
        // }
        for (int i = 0; i < s.length(); i++) {
            char val = s.charAt(i);
            if (map.containsKey(val)) {
                map.put(val, map.get(val) + 1);
            } else {
                map.put(val, 1);
            }
        }

        // looping on t
        for (int i = 0; i < t.length(); i++) {
            if (map.containsKey(t.charAt(i))) {
                // frequency --
                map.put(t.charAt(i), map.get(t.charAt(i)) - 1);
            } else {
                return false;
            }

            if ((map.get(t.charAt(i))) == 0) {
                map.remove(t.charAt(i));
            }
        }

        if (map.isEmpty()) {
            return true;
        }

        return false;
    }

    public static void main(String[] args) {
        String s = "racee";
        String t = "caree";
        System.out.println(validAnagram(s, t));
    }
}

// approch is :-
// firstly insert all the char of first string in the hashmap with their
// respective frequency and then in the other string iteration minus the
// frquency if the frequency for all the char becames 0 then says true else
// false.