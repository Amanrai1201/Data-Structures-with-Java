import java.util.HashMap;
import java.util.Set;

// find the number who's frquency is greater than n/3;
public class MajorityElement {

    public static void Create(int[] arr) {
        HashMap<Integer, Integer> frequency = new HashMap<>();

        for (int i = 0; i < arr.length; i++) {
            int nums = arr[i];
            if (frequency.containsKey(nums)) {
                frequency.put(nums, frequency.get(nums) + 1); // update the frequency if already present
            } else {
                frequency.put(nums, 1); // initalise the value of frequency
            }
        }

        // loop for getting all the values of map
        Set<Integer> nums = frequency.keySet();
        // System.err.println(keys);
        for (Integer key : nums) {
            if (frequency.get(key) > (arr.length / 3)) {
                System.out.println(key);
            }
        }
    }

    public static void main(String[] args) {
        int arr[] = { 1, 3, 1, 2, 3, 5, 1, 5, 1 };
        Create(arr);
    }
}
