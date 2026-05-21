// 283 Move Zeroes 
public class MoveZeroes {
    public static void main(String[] args) {
        int[] nums = { 0, 1, 0, 3, 12 };
        int k = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                nums[k] = nums[i];
                k++;
            }
        }

        while (k < nums.length) {
            nums[k] = 0;
            k++;
        }
        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i] + " ");
        }
    }
}
