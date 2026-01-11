public class Max_Subarrays2 {
    // using kadane's algorithm
    // public static void ForNegative(int arr[]) {
    // for (int i = 0; i < arr.length; i++) {
    // int MaxSum = Integer.MAX_VALUE;
    // if (arr[i] > 0) {
    // return;
    // } else {
    // MaxSum = Math.max(arr[i], MaxSum);
    // }
    // // System.out.println(MaxSum);
    // }
    // }

    public static int kadanes(int arr[]) {
        int CurrentSum = 0;
        int MaxSum = 0;
        for (int i = 0; i < arr.length; i++) {
            // updating cs and ms
            CurrentSum = CurrentSum + arr[i];
            if (CurrentSum < 0) {
                CurrentSum = 0;
            }
            MaxSum = Math.max(MaxSum, CurrentSum);
        }
        return MaxSum;
    }

    public static void main(String[] args) {
        int arr[] = { -2, -3, 4, -1, -2, 1, 5, -3 };
        int maxsum = kadanes(arr);
        System.out.println("maximun subArray sum is " + maxsum);
    }
}
