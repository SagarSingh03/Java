
// Array subset : 
import java.util.*;

public class ArraySubset {
    public static boolean isSubset(int[] A, int[] B) {
        if (B.length > A.length)
            return false;

        Arrays.sort(A);
        Arrays.sort(B);

        int i = 0, j = 0;
        while (i < A.length && j < B.length) {
            if (A[i] == B[j]) {
                i++;
                j++;
            } else {
                i++;
            }
        }
        return j == B.length;
    }

    public static void main(String[] args) {
        int[] A = { 11, 7, 1, 13, 21, 3, 7, 3 };
        int[] B = { 11, 3, 7, 1, 7 };

        System.out.println(isSubset(A, B));
    }
}