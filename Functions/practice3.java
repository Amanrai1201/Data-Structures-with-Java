import java.util.Scanner;

public class practice3 {
    // Write a function to print the sum of all odd numbers from 1 to n
    public static int sumOdd(int n) {
        int sum = 0;
        while (n >= 1) {
            if ((n % 2 != 0)) {
                sum = sum + n;
                n = n - 2;
            } else {
                n = n - 1;
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(sumOdd(n));
    }
}
