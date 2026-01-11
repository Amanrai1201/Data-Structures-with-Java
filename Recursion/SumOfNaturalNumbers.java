public class SumOfNaturalNumbers {
    public static int sum(int n) {
        // base case
        if (n == 1) {
            return 1;
        }
        return n + sum(n - 1);
    }

    public static void main(String[] args) {
        System.out.println(sum(100));
    }
}
