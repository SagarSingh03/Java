// Remove duplicates from the sorted array 
import java.util.*;

public class RemoveDuplicates {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 3, 4, 5, 5, 5, 6 };

        ArrayList<Integer> result = new ArrayList<>();

        for (int i = 0; i < arr.length; i++) {
            if (i == 0 || arr[i] != arr[i - 1]) {
                result.add(arr[i]);
            }
        }
        System.out.println(result);
    }
}
