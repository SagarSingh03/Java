// Leetcode : 832
import java.util.Arrays;

public class FlippingtheImage {
    public static void main(String[] args) {
        int[][] image = { { 1, 1, 0 }, { 1, 0, 1 }, { 0, 0, 0 } };

        for (int i = 0; i < image.length; i++) {
            int[] row = image[i];

            // Reverse the row
            int left = 0,
                    right = row.length - 1;

            while (left < right) {
                int temp = row[left];
                row[left] = row[right];
                row[right] = temp;

                left++;
                right--;
            }
            // Invert the row :
            for (int j = 0; j < row.length; j++) {
                if (row[j] == 0) {
                    row[j] = 1;
                } else {
                    row[j] = 0;
                }
            }
        }

        // Print the final stage
        for (int[] row : image) {
            System.out.println(Arrays.toString(row));
        }
    }

}