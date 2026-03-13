import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

public class GroupAnagram {

    public static void groupAnagram(String[] strs) {
        HashMap<String, Integer> map = new HashMap<>();
        HashSet<Integer> set = new HashSet<>();
        ArrayList<String> list = new ArrayList<>();
        ArrayList<String> list2 = new ArrayList<>();
        for (int i = 0; i < strs.length; i++) {
            String s = strs[i];
            int value = 0;
            for (int j = 0; j < s.length(); j++) {
                value += s.charAt(j);
            }
            map.put(strs[i], value);
        }

        for (int i = 0; i < map.size(); i++) {
            if (!set.add(map.get(strs[i]))) {
                list.add(strs[i]);
            } else {
                list2.add(strs[i]);
            }
        }
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list);
        }
    }

    public static void main(String[] args) {
        String strs[] = { "eat", "tea", "ate", "bat", "tan", "nat" };
        groupAnagram(strs);
    }
}