public class Trapping_Rainwater {
    // finding the maximun rainwater trapped
    public static int MaxRainwaterTrapped(int arr[]) {
        int n = arr.length;
        int left[] = new int[n];
        int right[] = new int[n];
        left[0] = arr[0];
        right[n - 1] = arr[n - 1];
        // finding left and right maximun for every building using two pointers approch
        for (int i = 1; i < n; i++) {
            left[i] = Math.max(left[i - 1], arr[i]);
        }
        for (int i = n - 2; i >= 0; i--) {
            right[i] = Math.max(arr[i], right[i + 1]);
        }

        // calculating trapped water
        int WL = 0;
        int TW = 0;
        int Total_Trapped_water = 0;
        for (int i = 0; i < n; i++) {
            WL = Math.min(left[i], right[i]);
            TW = WL - arr[i];
            if (TW < 0) {
                TW = 0;
            }
            Total_Trapped_water += TW;
            TW = 0;
        }
        return Total_Trapped_water;
    }

    public static void main(String[] args) {
        int arr[] = { 4, 2, 0, 6, 3, 2, 5 };
        System.out.println(MaxRainwaterTrapped(arr));
    }
}