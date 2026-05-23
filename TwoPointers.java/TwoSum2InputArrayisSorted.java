// Two Sum 2 input array is sorted 

import java.util.Arrays;

public class TwoSum2InputArrayisSorted {
    public static void main(String[] args) {

        int[] nums = {2, 7, 11, 15};
        int target = 9;

        int i = 0;
        int j = nums.length - 1;

        while (i < j) {

            int sum = nums[i] + nums[j];

            if (sum > target) {
                j--;
            } 
            else if (sum < target) {
                i++;
            } 
            else {
                int[] result = {i + 1, j + 1};
                System.out.println(Arrays.toString(result));
                return;
            }
        }

        System.out.println(Arrays.toString(new int[]{-1, -1}));
    }
}