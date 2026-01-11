import java.util.Arrays;

public class Reverse_String {
    // Write a function that reverses a string. The input string is given as an
    // array of characters s.

    // You must do this by modifying the input array in-place with O(1) extra
    // memory.

    // Example 1:

    // Input: s = ["h","e","l","l","o"]
    // Output: ["o","l","l","e","h"]
    // Example 2:

    // Input: s = ["H","a","n","n","a","h"]
    // Output: ["h","a","n","n","a","H"]

    // Constraints:

    // 1 <= s.length <= 105
    // s[i] is a printable ascii character.
    public static String[] ReverseString(String s[]) {
        // using two pointers approch
        String temp = "";
        int n = s.length;
        for (int i = 0; i < n / 2; i++) {
            int start = i;
            int end = n - 1 - i;

            // swapping
            temp = s[end];
            s[end] = s[start];
            s[start] = temp;
        }

        return s;

    }

    public static void main(String[] args) {
        String s[] = { "h", "e", "l", "l", "o" };
        System.out.println(Arrays.toString(ReverseString(s)));
    }

}
