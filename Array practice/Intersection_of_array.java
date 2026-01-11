// import java.util.ArrayList;
// import java.util.List;

// public class Intersection_of_array {
//     public static void main(String[] args) {
//          int[] arr1 = {1,2,3,4,4,5,5};
//          int[] arr2 = {1,2,3,4,6};

//         intersection(arr1,arr2);
//     }

//     public static void intersection(int[] arr1 , int[] arr2){
//         int n1 = arr1.length;
//         int n2 = arr2.length;
//         int i = 0;
//         int j = 0;
//          List<Integer> inter = new ArrayList<>();;
//         while(i<n1 && j<n2){
//             if(arr1[i] == arr2[j]){
//                 inter.add(arr1[i]);
//                 i++;
//                 j++;
//             }
//             if(arr1[i] < arr2[j]){
//                 i++;
//             }
//             else{
//                 j++;
//             }
//         }
//         return inter;
//     }
// }


import java.util.ArrayList;
import java.util.List;

public class Intersection_of_array {
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 4, 4, 5, 5};
        int[] arr2 = {1, 2, 3, 4, 6};

        List<Integer> result = intersection(arr1, arr2);
        System.out.println("Intersection: " + result);
    }

    public static List<Integer> intersection(int[] arr1, int[] arr2) {
        int n1 = arr1.length;
        int n2 = arr2.length;
        int i = 0, j = 0;
        List<Integer> inter = new ArrayList<>();

        while (i < n1 && j < n2) {
            if (arr1[i] == arr2[j]) {
                inter.add(arr1[i]);
                i++;
                j++;
            } else if (arr1[i] < arr2[j]) {
                i++;
            } else {
                j++;
            }
        }

        return inter;
    }
}
