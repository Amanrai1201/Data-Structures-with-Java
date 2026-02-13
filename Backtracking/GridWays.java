public class GridWays {

    public static int CountWays(int i, int j, int n, int m) {
        // base case
        if (i == n - 1 || j == m - 1) {
            return 1;
        } else if (i == n || j == m) {
            return 0;
        }

        // recursive function
        // total ways
        int x = CountWays(i + 1, j, n, m);
        int y = CountWays(i, j + 1, n, m);
        return x + y;
    }

    public static void main(String[] args) {
        System.out.println(CountWays(0, 0, 3, 3));
    }
}
