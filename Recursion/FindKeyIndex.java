public class FindKeyIndex {
    public static int find(int key, int[] arr, int index) {
        if (index >= arr.length) {
            return -1;
        }
        if (arr[index] == key) {
            return index + 1;
        }
        return find(key, arr, index + 1);
    }

    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5, 69, 7, 8 };
        int index = 0;
        int key = 9;
        System.out.println(find(key, arr, index));
    }
}
