public class MeanofArray {
    public static void main(String[] args) {
        int[] nums = { -1, 0, 2, 5, 1, 1, 5 };
        int sum = 0;
        int size = nums.length;
        for (int i = 0; i < nums.length; i++) {
            sum = sum + nums[i];
        }
        System.out.print(sum / size);
    }
}
