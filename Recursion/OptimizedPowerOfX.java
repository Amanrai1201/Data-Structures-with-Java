public class OptimizedPowerOfX {
    public static int optmizedPower(int x, int n) {
        if (n == 0) {
            return 1;
        }
        int halfPower = optmizedPower(x, n / 2);
        int power = halfPower * halfPower;

        if ((n % 2) != 0) {
            power = power * x;
        }
        return power;
    }

    public static void main(String[] args) {
        int x = 2;
        int n = 10;
        System.out.println(optmizedPower(x, n));
    }
}
