public class findContinousSubString {
    public static void findSub(String str, int j, int i) {
        char temp = str.charAt(j);
        CountSubstring(str, i);
    }

    public static void CountSubstring(String str, int i) {
        int count = 0;
        // base case
        if (i == str.length()) {
            return;
        }

        if (str.charAt(i) == temp) {
            count++;
        }
        CountSubstring(str, i + 1);
    }
}
