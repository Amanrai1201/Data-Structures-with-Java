import java.util.*;

public class Count_Ceaser_Cipher {

    public static int CheckStrings(String[] words) {
        HashMap<String, Integer> map = new HashMap<>();

        for (String word : words) {

            int shift = word.charAt(0) - 'a';

            StringBuilder pattern = new StringBuilder();

            for (char c : word.toCharArray()) {
                int newChar = (c - 'a' - shift + 26) % 26;
                pattern.append((char) ('a' + newChar));
            }

            String key = pattern.toString();
            map.put(key, map.getOrDefault(key, 0) + 1);
        }

        int count = 0;

        for (int val : map.values()) {
            count += val * (val - 1) / 2;
        }

        return count;
    }

    public static void main(String[] args) {
        String words[] = { "fusion", "layout" };
        System.out.println(CheckStrings(words));
    }
}