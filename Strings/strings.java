import java.util.Scanner;

public class strings {
    public static void main(String[] args) {
        // string declaration
        // String name = "aman";
        String full_name = "aman rai";
        // System.out.println(full_name);

        // taking string as input
        // Scanner sc = new Scanner(System.in);
        // String name = sc.nextLine();
        // System.out.println("betichod ka naam hai " + name);

        // concatination :- strings ko jodna
        // using + we can add two strings

        // charAt
        // for (int i = 0; i < full_name.length(); i++) {
        // System.out.println(full_name.charAt(i));
        // }

        // comparing two strings
        // String name = "aman";
        // String namama = "aman";

        // if (name.compareTo(namama) == 0) {
        // System.out.println("equal");
        // }

        // sub-string in java
        String name = "my name is tony";
        // substring m begining index and ending index hota hai
        String sub = name.substring(11, 15);
        System.out.println(sub);

        // Strings are immutable
    }
}
