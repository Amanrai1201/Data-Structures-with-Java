import java.util.ArrayList;

public class PairSum {
    public static ArrayList<Integer> pairSum(int[] arr, int target) {
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] + arr[j] == target) {
                    list.add(arr[i]);
                    list.add(arr[j]);
                }
            }
        }
        return list;
    }

    public static boolean pair(int[] arr, int target) {
        int lp = 0, rp = arr.length - 1;
        while (rp >= lp) {
            if (arr[rp] + arr[lp] == target) {
                return true;
            } else if (arr[rp] + arr[lp] > target) {
                rp--;
            } else {
                lp--;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5, 6 };
        ArrayList<Integer> result = pairSum(arr, 5);
        System.out.println(result);
        System.out.println(pair(arr, 5));
    }
}