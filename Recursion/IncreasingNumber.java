public class IncreasingNumber {
    public static void Increase(int n) {
        // base case
        if (n == 1) {
            System.out.println(1);
            return;
        }
        Increase(n - 1);
        System.out.println(n);
    }

    public static void main(String[] args) {
        Increase(10);
    }
}
