
// Here we are merging two sorted or unsorted arrays : remember is the arrays are already sorted then remove the Arrays.sort(); 
import java.util.*;

public class MergeTwoSortedArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // Scanner kya karta hai sirf utne hi elements leta hai jitna i/p dia not extra 
        // extra values ignore 
        int n = sc.nextInt();
        int m = sc.nextInt();

        int[] arr1 = new int[n];
        for (int i = 0; i < n; i++) {
            arr1[i] = sc.nextInt();
        }
        Arrays.sort(arr1);

        int[] arr2 = new int[m];
        for (int i = 0; i < m; i++) {
            arr2[i] = sc.nextInt();
        }
        Arrays.sort(arr2);

        int s1 = arr1.length;
        int s2 = arr2.length;

        int[] result = new int[s1 + s2];
        int i = 0, j = 0, k = 0; // i j k are pointers i for arr1 j for arr2 and k for result

        // merge both arrays

        while (i < s1 && j < s2) {
            if (arr1[i] <= arr2[j]) {
                result[k++] = arr1[i++];
            } else {
                result[k++] = arr2[j++];
            }
        }

        // Remaining elements
        while (i < s1) {
            result[k++] = arr1[i++];
        }

        while (j < s2) {
            result[k++] = arr2[j++];
        }

        System.out.print(Arrays.toString(result));

    }
}
