// import java.util.*;

// public class CheckArraySorted {
//     public static void main(String[] args) {
//         int[] nums = { 3, 4, 5, 1, 2 };
//         Arrays.sort(nums);

//         System.out.println(Arrays.toString(nums));
//     }
// }

// ********************************************************************
import java.util.*;

public class CheckArraySorted {
    public static void main(String[] args) {
        int[] arr = { 5, 4, 3, 6, 1, 2 };
        int n = arr.length;

        boolean isSorted = true;

        for (int i = 1; i < n; i++) {
            if (arr[i] < arr[i - 1]) {
                isSorted = false;
                break;

            }
        }
        if (isSorted) {
            System.out.print("Array is sorted");
        } else {
            System.out.print("Array is not sorted");
        }
    }
}