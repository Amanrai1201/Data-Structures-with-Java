public class findLengthOfString {
    public static void findlength(String s, int i) {
        if (i == s.length()) {
            System.out.println(i);
            return;
        } else {
            findlength(s, i + 1);
        }
    }

    public static void main(String[] args) {
        findlength("aman", 0);
    }
}
