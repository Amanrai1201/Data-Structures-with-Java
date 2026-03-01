import java.util.*;

public class practice {

    public static void main(String[] args) {
        HashMap<String, Integer> hm = new HashMap<>();

        // insert
        hm.put("Aman", 011);
        hm.put("Mehak", 61);
        hm.put("Himanshu", 44);
        hm.put("Mahak", 59);

        // System.err.println(hm);

        System.out.println(hm.get("Himanshu"));

    }
}