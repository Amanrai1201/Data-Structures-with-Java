
// finding subset using recurion and backtracking
import java.util.*;

public class FindSubset {
    public static List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        backtrack(0, nums, new ArrayList<>(), result);
        return result;
    }

    private static void backtrack(int index, int[] nums, List<Integer> current, List<List<Integer>> result) {
        // add current subset
        result.add(new ArrayList<>(current));

        // explore further elements
        for (int i = index; i < nums.length; i++) {
            current.add(nums[i]); // choose
            backtrack(i + 1, nums, current, result); // explore
            current.remove(current.size() - 1); // un-choose (backtrack)
        }
    }

    public static void main(String[] args) {
        int[] nums = { 1, 2, 3 };
        subsets(nums);
    }
}