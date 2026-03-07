// LeetCode : 2529 Count Positive numbers and negative numbers and return the Max number between both the numbers
public class CountPositiveNegative {
    public static void main(String[] args) {
        int[] nums = { -2, -1, 0, 1, 2, 3, 4, 5 };
        int pos = 0;
        int neg = 0;
        for (int num : nums) {
            if (num > 0) {
                pos++;
            } else if (num < 0) {
                neg++;
            }
        }
        int result = Math.max(pos, neg);
        System.out.print(result);
    }
}
