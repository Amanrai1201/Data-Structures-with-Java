import java.util.ArrayList;

public class findOccurence {

    public static void CheckOccurence(int nums[], int[] query, int x) {
        ArrayList<Integer> index = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == x) {
                index.add(i);
            }
        }

        int[] answer = new int[query.length];

        for (int i = 0; i < query.length; i++) {
            if (query[i] <= index.size()) {
                int place = query[i] - 1;
                answer[i] = index.get(place);
            } else {
                answer[i] = -1;
            }
        }

        for (int i = 0; i < answer.length; i++) {
            System.out.println(answer[i]);
        }
    }

    public static void main(String[] args) {
        int nums[] = { 1, 2, 3, 1, 5, 1 };
        int query[] = { 1, 2, 6, 3, 7 };

        CheckOccurence(nums, query, 1);
    }
}