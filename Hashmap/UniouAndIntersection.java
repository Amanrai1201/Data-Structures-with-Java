import java.util.HashSet;

public class UniouAndIntersection {
    public static void UAndI(int[] a, int[] b) {
        HashSet<Integer> union = new HashSet<>();
        // HashMap<Integer, Integer> intersection = new HashMap<>();
        HashSet<Integer> intersection = new HashSet<>();
        int count = 0;
        // for (int i = 0; i < a.length; i++) {
        // union.add(a[i]);
        // intersection.put(a[i], 1);
        // }

        for (int i = 0; i < a.length; i++) {
            union.add(a[i]);
            intersection.add(a[i]);
        }

        // for (int i = 0; i < b.length; i++) {
        // union.add(b[i]);
        // if (intersection.containsKey(b[i])) {
        // intersection.put(b[i], intersection.get(b[i]) + 1);
        // }
        // }

        for (int i = 0; i < b.length; i++) {
            union.add(b[i]);
            if (intersection.contains(b[i])) {
                intersection.remove(b[i]);
                count++;
            }
        }

        // for (Integer i : intersection.keySet()) {
        // if (intersection.get(i) == 1) {
        // intersection.remove(i);
        // }
        // }

        System.out.println("Union" + union.size() + "intersection" + count);

    }

    public static void main(String[] args) {
        int[] a = { 7, 3, 9 };
        int[] b = { 4, 3, 5, 2, 7, };

        UAndI(a, b);
    }
}
