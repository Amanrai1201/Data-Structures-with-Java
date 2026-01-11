// For a given integer array of size N. You have to find all the occurrences
// (indices) of a given element (Key) and print them. Use a recursive function to solve this
// problem.
// Sample Input : arr[ ] = {3, 2, 4, 5, 6, 2, 7, 2, 2}, key = 2
// Sample Output : 1 5 7 8

public class Assigment1 {

    public static void checkkey(int[] arr, int key, int i) {
        // base case
        if (i == arr.length) {
            return;
        }

        if (arr[i] == key) {
            System.out.println(i + 1);
        }

        checkkey(arr, key, i + 1);
    }

    public static void main(String[] args) {
        int key = 6;
        int[] arr = { 1, 3, 6, 7, 4, 6, 8, 6 };
        int i = 0;
        checkkey(arr, key, i);
    }
}