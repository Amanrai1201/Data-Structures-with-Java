public class SplitIntoOnes {

    public static int Split(int n) {
        // base case
        if (n == 1) {
            return 0;
        }

        int a = n / 2;
        int b = n - a;
        int cost = a * b;

        return cost + Split(a) + Split(b);
    }

    public static void main(String[] args) {
        int n = 5;
        System.out.println(Split(n));
    }
}