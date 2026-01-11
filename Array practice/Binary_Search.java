public class Binary_Search {
    // only applicable on sorted arrays
    public static int BinarySearch(int arr[], int key) {
        int n = arr.length;
        int start = 0;
        int end = n - 1;
        for (int i = start; i < end; i++) {
            int middle = (start + end) / 2;
            if (arr[middle] > key) {
                end = middle - 1;
            } else if (arr[middle] < key) {
                start = middle + 1;
            } else if (arr[middle] == key) {
                return middle + 1;
            }
        }
        return 0;
    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4, 5, 6, 7, 8 };
        int key = 5;
        System.out.println(BinarySearch(arr, key));
    }
}
