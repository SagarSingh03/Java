// Leetcode Contest : BW : 178
import java.util.Set;
import java.util.HashSet;

public class FirstUniqueEvenElement {
    public static void main(String[] args) {
        int[] nums = { 3, 4, 2, 5, 4, 6 };

        Set<Integer> seen = new HashSet<>();
        Set<Integer> duplicates = new HashSet<>();

        for (int num : nums) {
            if (seen.contains(num)) {
                duplicates.add(num);
            } else {
                seen.add(num);
            }
        }

        for (int num : nums) {
            if (num % 2 == 0 && !duplicates.contains(num)) {
                System.out.println("First unique even element: " + num);
                return;
            }
        }
        System.out.println("No Unique element found");
    }
}