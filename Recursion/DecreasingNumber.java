// print number in decreasing order from n to 1
public class DecreasingNumber {
    public static void recursion(int n) {
        System.out.println(n);
        // base case
        if (n <= 1) {
            return;
        }
        recursion(n - 1);
    }

    public static void main(String[] args) {
        recursion(5);
    }
}