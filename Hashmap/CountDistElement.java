import java.util.HashSet;

public class CountDistElement {

    public static int CountDist(int[] arr) {

        HashSet<Integer> set = new HashSet<>();
        int count = 0;

        for (int i = 0; i < arr.length; i++) {
            if (!set.contains(arr[i])) {
                set.add(arr[i]);
                count++;
            }
        }

        return count;
    }

    public static void main(String[] args) {
        int[] arr = { 2, 3, 4, 5, 2, 3, 6, 7, 12, 8 };
        System.out.println(CountDist(arr));
    }
}
