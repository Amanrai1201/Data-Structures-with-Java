public class Fabonnaci {
    // using recursion
    public static void fabonnaci_series(int n) {
        int first_number = 0, second_number = 1;
        int next_number = 0;
        for (int i = 0; i <= n; i++) {
            System.out.print(first_number + ", ");
            next_number = first_number + second_number;
            first_number = second_number;
            second_number = next_number;
        }
    }

    public static void main(String[] args) {
        int n = 10;
        fabonnaci_series(n);
    }
}
