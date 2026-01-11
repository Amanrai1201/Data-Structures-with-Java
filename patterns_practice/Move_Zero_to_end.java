// arr[1,0,2,0,3,0,4] => [1,2,3,4,0,0,0]
// you have given an array of integers, move all the 0's to the end of it while maintaining the relative order of the non-zero elements.
// public class Move_Zero_to_end {
//     public static void moveZeroes(int[] arr){
//         arr[] = [1,0,2,0,3,0,4,0]
//         zeros(arr);
//     }
//     public int Zeroes(int[] arr){
//          int n = arr.length;
//         int j = 0;
//         // using two pointers approach
//         for(int i=0; i<n; i++){
//             if(arr[i] == 0){
//                 j = i;
//                 break;
//             }
//         }
//         int temp = 0;
//         for(int i=j+1; i<n; i++){
//             if(arr[i]!=0){
//                 temp = arr[i];
//                 arr[i] = arr[j];
//                 arr[j] = temp;
//                 j++;
//             }
//         }
//         return arr[];
//     }
   
// }


public class Move_Zero_to_end {

    public static void moveZeroes(int[] arr) {
        int n = arr.length;
        int j = 0; // pointer for the position to place next non-zero element

        // Traverse the array
        for (int i = 0; i < n; i++) {
            if (arr[i] != 0) {
                // Swap arr[i] and arr[j]
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                j++;
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = {1, 0, 2, 0, 3, 0, 4, 0};

        moveZeroes(arr);

        // print the result
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}
