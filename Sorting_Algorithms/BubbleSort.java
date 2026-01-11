import java.util.Scanner;

public class BubbleSort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        bubbleSort(arr, n);
        System.out.println("SORTED ARRAY");
        for (int i = 0; i < n; i++) {
            System.out.println(arr[i]);
        }
    }

    public static void bubbleSort(int[] arr, int n) {
        int temp2 = 0;
        int count = 0;
        for (int turn = 0; turn < n - 1; turn++) {
            for (int j = 0; j < (n - 1 - turn); j++) {
                if (arr[j] > arr[j + 1]) {
                    temp2 = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp2;
                    count = count + 1;
                }
            }
            if (count == 0) {
                System.out.println("NO SORTING REQUIRED");
                return;
            }
        }
    }
}
