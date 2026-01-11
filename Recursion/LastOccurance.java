public class LastOccurance {
    public static int find(int arr[], int key, int index, int position) {
        if (index == arr.length) {
            return position;
        }

        if (arr[index] == key) {
            position = index + 1;
        }

        return find(arr, key, index + 1, position);
    }

    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5, 6, 8 };
        int key = 5;
        int index = 0;
        int position = -1;
        System.out.println(find(arr, key, index, position));
    }
}
