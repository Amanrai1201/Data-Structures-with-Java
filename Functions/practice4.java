import java.util.Scanner;

public class practice4 {
    // Write a function which takes in 2 numbers and returns the greater of those
    // two.

    public static int maxValue(int a, int b) {
        int greater = 0;
        if (a >= b) {
            greater = a;
        } else {
            greater = b;
        }
        return greater;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println(maxValue(a, b));
    }
}
