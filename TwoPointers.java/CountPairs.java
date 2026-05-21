// Count Pairs whose sum is less than the target
public class CountPairs {
    public static void main(String[] args) {
        int[] nums = { 0, 1, 2, 3, 4, 5, 6, 7 };
        int target = 7;

        int left = 0;
        int right = nums.length - 1;
        int count = 0;

        while (left < right) {
            if (nums[left] + nums[right] < target) {
                count += (right - left);
                left++;
            } else {
                right--;
            }
        }
        System.out.print("Pair Values " + count);
    }
}
