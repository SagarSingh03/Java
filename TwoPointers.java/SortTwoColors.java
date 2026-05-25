// Not a LeetCode Question : 
public class SortTwoColors {

    public static void sortTwoColors(int[] nums) {
        int i = 0, j = nums.length - 1;

        while (i <= j) {
            if (nums[i] == 0) {
                i++;
            } else {
                int temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;

                j--;
            }
        }
    }

    public static void main(String[] args) {
        int[] nums = { 0, 1, 1, 1, 0, 0, 1, 1 };

        System.out.println("BEFORE");
        for (int i = 0; i < nums.length; i++) {
            System.out.println(nums[i]);
        }

        sortTwoColors(nums);

        System.out.println("AFTER");
        for (int i = 0; i < nums.length; i++) {
            System.out.println(nums[i]);
        }
    }
}
