public class SecondLargest {
    public static int SecondMAX(int[] arr) {
        int n = arr.length;
        int first = 0;
        int last = n - 1;
        int temp = 0;
        for (int i = 0; i < n / 2; i++) {
            temp = arr[last];
            arr[last] = arr[first];
            arr[first] = temp;
            first++;
            last--;
        }
    }

    public static void main(String[] args) {
        int[] arr = { 12, 22, 10, 9, 5 };
        SecondMAX(arr);
        System.out.println("Reversed array");
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }

}
