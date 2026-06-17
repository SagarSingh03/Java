// LeetCode : Maximum Average Subarray I 643
public class MaximumAverageSubarrayI {
    public static void main(String[] args) {
        int[] nums = { 1, 12, -5, - 6, 50, 3 };
        int k = 4;

        int sum = 0;

        // First Sliding Window

        for (int i = 0; i < k; i++) {
            sum = sum + nums[i];
        }

        int maxSum = sum;

        // Sliding window
        for (int i = k; i < nums.length; i++) {
            sum = sum + nums[i] - nums[i - k];
            maxSum = Math.max(maxSum, sum);
        }

        double average = (double) maxSum / k;
        System.out.print(average);
    }
}
