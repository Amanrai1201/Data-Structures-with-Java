// public class Print_Subarrays {
//     // subArrays is the countinous part of array
//     // in any array n*(n+1)/2 subarrays exits
//     public static void subArrays(int arr[]) {
//         for (int i = 0; i < arr.length; i++) {
//             // inner loop
//             System.out.print("(" + arr[i] + ")");
//             for (int j = i + 1; j < arr.length; j++) {

//                 System.out.print("(" + arr[i] + "," + arr[j] + ")");
//             }
//             System.out.println();
//         }
//     }

//     public static void main(String[] args) {
//         int arr[] = { 2, 4, 6, 8, 10 };
//         int n = arr.length;
//         subArrays(arr);
//         int Total_Subarrays = n * (n + 1) / 2;
//         System.out.println("Total Subarray " + Total_Subarrays);
//     }
// }

// Second appproch :- Shraddha khapra
public class Print_Subarrays {

    public static void subArrays(int arr[]) {
        // using three loops
        int sum = 0;
        int greatest = 0;
        for (int i = 0; i < arr.length; i++) {
            int start = i;
            for (int j = i; j < arr.length; j++) {
                int end = j;
                for (int k = start; k <= end; k++) {
                    System.out.print(arr[k] + " ");
                    sum = arr[k] + sum;
                }
                System.out.println();
                System.out.println("sum of Subarray" + sum);
                if (sum >= greatest) {
                    greatest = sum;
                }
                sum = 0;
                System.out.println();
            }
        }
        System.out.println();
        System.out.println("greatest is " + greatest);
    }

    public static void main(String[] args) {
        int arr[] = { 2, 4, 6, 8, 10 };
        subArrays(arr);
    }
}