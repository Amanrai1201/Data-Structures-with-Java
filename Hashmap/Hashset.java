import java.util.HashSet;
import java.util.Iterator;

public class Hashset {
    public static void main(String[] args) {
        HashSet<String> cities = new HashSet<>();

        cities.add("Noida");
        cities.add("Indore");
        cities.add("Pune");
        cities.add("dewas");

        Iterator it = cities.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }

    }
}
