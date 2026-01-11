public class Linear_Search {

    public static int LinearSearch(int[] arr, int key) {
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            if (arr[i] == key) {
                return i + 1;
            }
        }
        return 0;
    }

    public static void main(String[] args) {
        // In Linear Search we find any value by linearly going through the array one by
        // one.
        int arr[] = { 1, 2, 3, 4, 6, 7, 8 };
        int key = 5;
        int result = LinearSearch(arr, key);
        System.out.println(result);
    }
}