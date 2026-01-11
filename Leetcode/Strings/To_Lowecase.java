public class To_Lowecase {
    // Given a string s, return the string after replacing every uppercase letter
    // with the same lowercase letter.

    // Example 1:

    // Input: s = "Hello"
    // Output: "hello"
    // Example 2:

    // Input: s = "here"
    // Output: "here"
    // Example 3:

    // Input: s = "LOVELY"
    // Output: "lovely"

    // Constraints:

    // 1 <= s.length <= 100
    // s consists of printable ASCII characters.

    public static String toLowerCase(String s) {
        String lower = s.toLowerCase();
        return lower;
    }

    public static void main(String[] args) {
        String str = "HELLO WORLD";
        System.out.println(toLowerCase(str));
    }
}
