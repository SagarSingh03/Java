public class SumofArray {
    public static void main(String[] args) {
        int[] nums = { -8, -4, -3, 0, 1, 5, 8, 9 };
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            sum = sum + nums[i];
        }
        System.out.print(sum + " ");
    }
}