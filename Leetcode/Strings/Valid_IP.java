import java.util.Scanner;

public class Valid_IP {
    // Given a valid (IPv4) IP address, return a defanged version of that IP
    // address.

    // A defanged IP address replaces every period "." with "[.]".

    // Example 1:

    // Input: address = "1.1.1.1"
    // Output: "1[.]1[.]1[.]1"
    // Example 2:

    // Input: address = "255.100.50.0"
    // Output: "255[.]100[.]50[.]0"

    // Constraints:

    // The given address is a valid IPv4 address.
    public static String defangIP(StringBuilder adress) {
        int n = adress.length();
        StringBuilder result = new StringBuilder("");
        for (int i = 0; i < n; i++) {
            if (adress.charAt(i) != '.') {
                result.append(adress.charAt(i));
            } else {
                result.append("[.]");
            }
        }
        return result.toString();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String address = sc.nextLine();
        StringBuilder sb = new StringBuilder(address);
        System.out.println(defangIP(sb));
    }

}
