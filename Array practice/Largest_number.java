public class Largest_number {
    // find the largest number in an array
    public static int Largest(int[] nums) {
        int largest = Integer.MIN_VALUE; // -infinity
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] >= largest) {
                largest = nums[i];
            }
        }
        return largest;
    }

    public static void main(String[] args) {
        int[] nums = { 2, 33, 45, 65, 75, 10 };
        System.out.println(Largest(nums));
    }
}

// also follows the same process for smallest using + infinity and finding the
// smallest