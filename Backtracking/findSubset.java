public class findSubset {
    public static void find(String str, String ans, int i) {
        // using recursion
        // base case
        if (i == str.length()) {
            if (ans.length() == 0) {
                System.out.println("null");
            }
            System.err.println(ans);
            return;
        }

        // yes
        find(str, ans + str.charAt(i), i + 1);

        // no
        find(str, ans, i + 1);
    }

    public static void main(String[] args) {
        String str = "abc";
        find(str, "", 0);
    }
}

// time complexity is (n)*(2^n)