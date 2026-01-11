public class RemoveDuplicates {
    public static void removeDuplicates(int index, boolean[] map, StringBuilder newstr, String str) {
        // base case
        if (index == str.length()) {
            System.out.println(newstr);
            return;
        }

        char currentChar = str.charAt(index);
        if (map[currentChar - 'a'] == true) {
            // duplicate
            removeDuplicates(index + 1, map, newstr, str);
        } else {
            map[currentChar - 'a'] = true;
            removeDuplicates(index + 1, map, newstr.append(currentChar), str);
        }
    }

    public static void main(String[] args) {
        int index = 0;
        boolean[] map = new boolean[26];
        String str = "appnnacollege";
        removeDuplicates(index, map, new StringBuilder(), str);
    }
}
