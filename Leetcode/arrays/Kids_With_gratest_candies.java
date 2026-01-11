import java.util.ArrayList;
import java.util.List;

public class Kids_With_gratest_candies {

    public static List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        // find the gratest first
        int n = candies.length;
        int gratest = -1;
        for (int i = 0; i < n; i++) {
            if (candies[i] >= gratest) {
                gratest = candies[i];
            }
        }
        List<Boolean> result = new ArrayList<>();
        for (int candy : candies) {
            result.add(candy + extraCandies >= gratest);
        }

        return result;
    }

    public static void main(String[] args) {
        int candies[] = { 4, 2, 2, 1 };
        int extraCandies = 1;
        System.out.println(kidsWithCandies(candies, extraCandies));
        ;
    }
}