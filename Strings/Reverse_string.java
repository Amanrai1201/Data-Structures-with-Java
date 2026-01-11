// public class Reverse_string {
// // reverse a given string
// public static void main(String[] args) {
// String name = "aman";
// int n = name.length() - 1;
// for (int i = n; i >= 0; i--) {
// System.out.println(name.charAt(i));
// }
// }
// }

// reversing string using stringbuilder
public class Reverse_string {

    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("mehak khan");
        for (int i = 0; i < sb.length() / 2; i++) {
            int first = i;
            int last = sb.length() - 1 - i;

            char fisrt_char = sb.charAt(first);
            char last_char = sb.charAt(last);

            sb.setCharAt(first, last_char);
            sb.setCharAt(last, fisrt_char);
        }
        System.out.println(sb);
    }
}