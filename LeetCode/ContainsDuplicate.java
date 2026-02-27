// // This is the Brute force way of finding the duplicates in an array. 
// public class ContainsDuplicate {
//     public static boolean containDuplicates(int[] nums) {
//         for (int i = 0; i < nums.length; i++) {
//             for (int j = i + 1; j < nums.length; j++) {
//                 if (nums[i] == nums[j]) {
//                     return true;

//                 }

//             }
//         }
//         return false;
//     }

//     public static void main(String[] args) {
//         int[] nums = { 1, 2, 2, 1, 3 };
//         System.out.println(containDuplicates(nums));
//     }
// }

// **********************************************************************************************

import java.util.Arrays;
public class ContainsDuplicate {
    public static boolean containsDuplicate(int[] nums) {
        Arrays.sort(nums);
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] == nums[i - 1]) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int[] nums = { 1, 2, 3, 4, 5, 6, 3, 1, 2, 3, 4, 5, 6 };
        System.out.print(containsDuplicate(nums));
    }
}