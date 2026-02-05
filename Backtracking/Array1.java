//backtracking for an array

public class Array1 {

    public static void array(int n, int i, int[] arr) {
        // base case
        if (i >= n) {
            for (int j = 0; j < 5; j++) {
                System.out.print(arr[j] + " ");
            }
            System.out.println(" ");
            return;
        }
        arr[i] = i + 1;
        array(n, i + 1, arr);
        arr[i] = arr[i] - 2;
    }

    public static void main(String[] args) {
        int[] arr = new int[5];
        array(5, 0, arr);
        for (int i = 0; i < 5; i++) {
            System.out.print(arr[i] + " ");
        }
    }

}