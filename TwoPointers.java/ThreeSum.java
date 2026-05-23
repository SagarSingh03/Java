// 3Sum LeetCode 

import java.util.Arrays;

public class ThreeSum {
    public static void main(String[] args) {
        int[] nums = { -1, 0, 1, 2, -1, -4 };
        Arrays.sort(nums);

        int triplet = 0; // triplets number will be stored here

        for (int i = 0; i < nums.length - 2; i++) {

            int j = i + 1; // left pointer
            int k = nums.length - 1; // right pointer

            while (j < k) {
                int sum = nums[i] + nums[j] + nums[k];

                if (sum > 0) {
                    k--;
                } else if (sum < 0) {
                    j++;
                } else {
                    System.out.println(
                            nums[i] + " " + nums[j] + " " + nums[k]);
                    triplet++;
                    j++;
                    k--;
                }
            }

        }
    }
}
