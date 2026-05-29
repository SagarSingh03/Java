// Average of every subarray of size k

public class Averageofeverysubarrayofsizek {
    public static void main(String[] args) {
        int[] nums = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
        int k = 3;
        int sum = 0;

        // first window sum
        for (int i = 0; i < k; i++) {
            sum += nums[i];
        }

        // first window average
        System.out.println((double) sum / k);

        // Sliding the window
        for (int i = k; i < nums.length; i++) {
            sum = sum + nums[i];
            sum = sum - nums[i - k];
            double average = (double) sum / k;
            System.out.print(average);
        }
    }
}
