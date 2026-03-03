public class ScoreDifferenceGame {

    public static int FindDiff(int arr[]) {
        int count = 0;
        boolean isFirstActive = true;
        int firstScore = 0;
        int secondScore = 0;

        for (int i = 0; i < arr.length; i++) {
            if ((arr[i] % 2) == 1) { // if odd swap
                // isFirstActive = !isFirstActive;
                count++;
            }
            if (((i + 1) % 6) == 0) { // for 6th term swap
                // isFirstActive = !isFirstActive;
                count++;
            }

            // now giving points
            if ((count % 2) == 1) {
                secondScore = arr[i] + secondScore;
            } else {
                firstScore = firstScore + arr[i];
            }

        }

        return firstScore - secondScore;
    }

    public static void main(String[] args) {
        int arr[] = { 2, 4, 2, 1, 2, 1 };
        System.out.println(FindDiff(arr));
    }
}