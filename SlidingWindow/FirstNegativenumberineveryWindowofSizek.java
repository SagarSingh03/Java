// First Negative number in every window of size K? 
public class FirstNegativenumberineveryWindowofSizek {
    public static void main(String[] args) {
        int[] nums = { 1, 2, 3, 4, -5, -6, 7, 8, 9 };
        int k = 3;

        for (int i = 0; i <= nums.length - k; i++) {
            boolean found = false;

            for (int j = i; j < i + k; j++) {
                if (nums[j] < 0) {
                    System.out.println(nums[j]);
                    found = true;
                    break;
                }
            }

            if (!found) {
                System.out.println(0);
            }
        }
    }
}

