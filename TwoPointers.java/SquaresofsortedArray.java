import java.util.*;

public class SquaresofsortedArray {
    public static void main(String[] args) {
        int[] nums = { -4, -1, 0, 3, 10 };
        int[] res = new int[nums.length];

        int i = 0, j = nums.length - 1;

        int k = nums.length - 1;

        while (i <= j) {

            if (Math.abs(nums[i]) > Math.abs(nums[j])) { // Math.abs makes all the -ve number positive and positive number remains positive
                res[k] = nums[i] * nums[i];
                i = i + 1;
            } else {
                res[k] = nums[j] * nums[j];
                j = j - 1;
            }
            k = k - 1;
        }
        System.out.println(Arrays.toString(res));
    }
}