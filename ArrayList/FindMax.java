import java.util.ArrayList;

public class FindMax {
    public static int findMax(ArrayList<Integer> list) {
        int greatest = Integer.MIN_VALUE;
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) > greatest) {
                greatest = list.get(i);
            }
        }

        return greatest;
    }

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(3);
        list.add(4);
        list.add(6);
        list.add(10);
        list.add(2);

        System.out.println(findMax(list));
    }
}