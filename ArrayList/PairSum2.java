public class PairSum2 {
    public static boolean pairSum(int[] nums, int target) {
        // find out the break point in the array
        int bp = -1;
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] > nums[i + 1]) {
                bp = i;
            }
        }

        int lp = bp + 1;
        int rp = bp;

        while (lp != rp) {
            if (nums[lp] + nums[rp] == target) {
                return true;
            } else if (nums[lp] + nums[rp] > target) {
                rp = (nums.length + rp - 1) % nums.length;
            } else {
                lp = (lp + 1) % nums.length;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int[] nums = { 11, 15, 6, 7, 8, 9, 10 };
        System.out.println(pairSum(nums, 16));
    }
}
