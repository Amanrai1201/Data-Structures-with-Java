import java.util.Scanner;

public class ValueEqualStrings {
    public static boolean checkEqualString(String s) {
        int start = 0;
        boolean hastwo = false;
        if (s.length() < 2) {
            return false;
        }
        while (start < s.length()) {
            char curr = s.charAt(start);

            int count = 1;
            while (start + 1 < s.length() && curr == s.charAt(start + 1)) {
                count++;
                start++;
            }
            if (count % 3 == 1) {
                return false;
            } else if (count % 3 == 2) {
                if (hastwo) {
                    return false;
                } else {
                    hastwo = true;
                }
            }
            start++;
        }
        return hastwo;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        System.out.println(checkEqualString(s));
    }
}