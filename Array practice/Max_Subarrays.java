public class Max_Subarrays {

    public static void MaxSubarrays(int arr[]) {
        // using prefix method
        int prefix[] = new int[arr.length];
        prefix[0] = arr[0];
        int CurrentSum = 0;
        int greatest = 0;
        for (int i = 1; i < arr.length; i++) {
            prefix[i] = prefix[i - 1] + arr[i];
        }

        // now finding max-subarray
        for (int i = 0; i < arr.length; i++) {
            int start = i;
            for (int j = i; j < arr.length; j++) {
                int end = j;
                // using prefix method if are going to find the sum
                if (start == 0) {
                    CurrentSum = arr[i];
                } else {
                    CurrentSum = prefix[end] - prefix[start - 1];
                }
                // swapping
                if (CurrentSum > greatest) {
                    greatest = CurrentSum;
                }
            }
        }
        System.out.println(greatest);
    }

    public static void main(String[] args) {
        int arr[] = { 2, 4, 6, 8, 10 };
        MaxSubarrays(arr);
    }
}