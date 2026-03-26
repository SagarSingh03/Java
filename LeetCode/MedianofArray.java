// Finding median of an array 
// to find median the array need to be sorted median ka matlb hi hota hai middle element in sorted data. 
import java.util.*;

public class MedianofArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        Arrays.sort(arr);

        double median;

        if (n % 2 == 0) { // Checking array size if the array is even then next step 
            median = (arr[n / 2 - 1] + arr[n / 2]) / 2.0;
        } else {
            median = arr[n / 2];
        }
        System.out.print(median);
    }
}
