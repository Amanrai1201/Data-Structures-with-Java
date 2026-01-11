public class PowerOfX {
    public static int power(int x, int n) {
        if (n == 1) {
            return x;
        }
        return x * power(x, n - 1);
    }

    public static void main(String[] args) {
        int x = 10;
        int n = 2;
        System.out.println(power(x, n));
    }
}
