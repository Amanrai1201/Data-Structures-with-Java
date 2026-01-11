import java.util.Scanner;

public class Check_Palindrome_String {

    public static boolean CheckPallindrome(String input) {
        for (int i = 0; i <= input.length() / 2; i++) {
            int first = i;
            int end = input.length() - 1 - i;
            if (input.charAt(first) != input.charAt(end)) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        System.out.println(CheckPallindrome(input));
    }
}
