import java.util.HashSet;
import java.util.Iterator;

public class Hashing {
    public static void main(String[] args) {
        // Creating
        HashSet<Integer> set = new HashSet<>();

        // Insert
        set.add(1);
        set.add(2);
        set.add(3);
        set.add(1);

        // Search
        if (set.contains(1)) {
            System.out.println("set Contains 1");
        }
        if (!set.contains(6)) {
            System.out.println("Does not contains 6");
        }

        // Delete
        set.remove(1);
        if (!set.contains(1)) {
            System.out.println("Does not contain 1 - we deleted 1");
        }

        // Size
        System.out.println("size of set is : " + set.size());

        // Print all elements
        System.out.println(set);

        // Iterator
        Iterator it = set.iterator();
        // Iterator has 2 important functions hasNext() and next
        while (it.hasNext()) {
            System.out.println(it.next());
        }

    }
}
