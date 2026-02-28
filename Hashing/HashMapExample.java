import java.util.*;

public class HashMapExample {
    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<>();

        // Insertion :
        map.put("India", 120);
        map.put("China", 120);
        map.put("US", 30);
        map.put("France", 45);
        map.put("UK", 5);

        // System.out.println(map);

        // //Here we get the updated values.
        // map.put("China" , 180);
        // System.out.println(map);

        // // Search Operation
        // if (map.containsKey("China")){
        // System.out.println("Present in the map");
        // } else {
        // System.out.println("Key is not present in the map");
        // }

        // System.out.println(map.get("China")); // Key exists
        // System.out.println(map.get("America"));

        // this is one way of iterating over an map
        // int arr[] = { 12, 15, 18 };
        // for (int i = 0; i < 3; i++) {
        // System.out.println(arr[i] + " ");
        // }
        // System.out.println();

        // // this is another way of iterating over an map
        // for (int val : arr) {
        // System.out.print(val + " ");
        // }
        // System.out.println();

        // for (int val : arr)
        // for (Map.Entry<String, Integer> e : map.entrySet()) { // entrySet is method
        // for all entries
        // System.out.println(e.getKey());
        // System.out.println(e.getValue());
        // }

        // Set<String> keys = map.keySet(); // keySet is method for all the keys
        // for (String key : keys) {
        // System.out.println(key + " " + map.get(key));
        // }

        // remove method to remove any specific keys
        map.remove("China");
        System.out.println(map);
    }
}
