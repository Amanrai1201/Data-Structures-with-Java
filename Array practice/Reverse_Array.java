public class Reverse_Array {
    // using two pointers approach

    public static int[] ReverseArray(int arr[]) {
        int temp = 0;
        for (int i = 0; i < arr.length / 2; i++) {
            int start = i;
            int end = arr.length - 1 - i;
            temp = arr[end];
            arr[end] = arr[start];
            arr[start] = temp;
        }
        return arr;
    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4, 5, 6, 7, 8 };
        int result[] = ReverseArray(arr);
        // for (int i : result) {
        // System.out.print(result[i]);
        // }
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i]);
        }
    }
}
