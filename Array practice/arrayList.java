import java.util.ArrayList;
import java.util.Collections;

public class arrayList {
    // collection framework
    // properties of arraylist :- size is variable , non-contigeous hota hai ,
    // arraylist me objects store hote hai.
    // operations in arraylist :- add, get, modify , delete, iteration
    public static void main(String[] args) {
        ArrayList<Integer> List = new ArrayList<Integer>();

        // add elements
        List.add(0);
        List.add(1);

        System.out.println(List);

        // get elements
        int element = List.get(0);
        System.out.println(element);

        // add element in between
        List.add(1, 1);
        System.out.println(List);

        // set element
        List.set(1, 5);
        System.out.println(List);

        // delete elements
        List.remove(1);

        // size
        int size = List.size();

        // loops
        for (int i = 0; i < List.size(); i++) {
            System.out.println(List.get(i));
        }

        // sorting
        Collections.sort(List);
        System.out.println(List);
    }
}
