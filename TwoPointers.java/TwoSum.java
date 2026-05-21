// Two Sum LeetCode 
// This is the brute force method 
// ***********************************************************
// public class TwoSum {
//     public static void main(String[] args){
//         int[] nums = {2,7,11,15};
//         int target = 9;


//         for (int i = 0; i < nums.length; i++){
//             for (int j = i + 1; j < nums.length; j++){
//                 if (nums[i] + nums[j] == target){
//                     System.out.println(i + " " + j);
//                 }
//             }
//         }
//     }
// }

// ************************************************************

public class TwoSum {
    public static void main(String[] args){
        int[] nums = {2,7,11,15};
        int target = 9;


        int left = 0;
        int right = nums.length - 1;

        while (left < right){
            int sum = nums[left] + nums[right];
            if (sum == target){
                System.out.print(left + " " + right);
                break;
            } 
            else if (sum < target){
                left++; 
            } 
             else {
                right--;
             }
        }
    }
}