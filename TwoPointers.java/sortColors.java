// Sort Colors LeetCode : 75
//  This code is not the best or right code

// public class sortColors {

//     public static void sortColors(int[] nums) {
//         int i = 0;
//         int j = i + 1;
//         int k = nums.length - 1;
//         while (i <= k) {
//             if (nums[i] == 0) {
//                 i++;
//             } else {
//                 int temp = nums[i];
//                 nums[i] = nums[k];
//                 nums[k] = temp;
//                 k--;
//             }
//         }

//     }

//     public static void main(String[] args) {
//         int[] nums = { 2, 0, 2, 1, 1, 0 };

//         System.out.println("Before : ");
//         for (int i = 0; i < nums.length; i++) {
//             System.out.println(nums[i]);
//         }

//         sortColors(nums);

//         System.out.println("After: ");
//         for (int i = 0; i < nums.length; i++) {
//             System.out.println(nums[i]);
//         }
//     }
// }

//  *************************************************************************************
// This is the best Code

public class sortColors {

    public static void sortColors(int[] nums) {
        int low = 0;
        int mid = 0;
        int high = nums.length - 1;

        while (low <= high) {
            if (nums[mid] == 0) {
                int temp = nums[low];
                nums[low] = nums[mid];
                nums[mid] = temp;
                low++;
                mid++;
            } else if (nums[mid] == 1) {
                mid++;
            } else {
                int temp = nums[mid];
                nums[mid] = nums[high];
                nums[high] = temp;
                high--;
            }
        }
    }

    public static void main(String[] args) {

        int[] nums = { 0, 2, 2, 1, 0, 1 };
        sortColors(nums);
        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i] + " ");
        }

    }
}