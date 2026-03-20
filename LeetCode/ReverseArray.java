import java.util.*;

public class ReverseArray {
    public static void main(String[] args) {
        int[] arr = { 9, 1, 2, 0, -3, -9 };
        int i = 0;
        int j = arr.length - 1;

        while (i < j) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;

            i++;
            j--;
        }

        for (int num : arr) {
            System.out.print(num + " ");
        }

    }
}
