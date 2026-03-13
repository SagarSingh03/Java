// Leetcode 53: Maximum Subarray sums 
// In Subarray the array need to be continuous 
// Subarray can Start from any index of the array


// public class MaximumSubarray {
//     public static void main(String[] args) {
//         int[] arr = { 1, 2, 3, 4, 5 };
//         int n = arr.length;

//         int maxSum = Integer.MIN_VALUE;

//         for (int st = 0; st < n; st++) {
//             int currSum = 0;
//             for (int end = st; end < n; end++) {
//                 currSum += arr[end];
//                 maxSum = Math.max(currSum, maxSum);
//                 for (int i = st; i <= end; i++) {
//                     System.out.print(arr[i] + " ");
//                 }
//                 System.out.println("Sum = " + currSum);
//             }
//             System.out.println();
//         }
//         System.out.println("Maximum Subarray sum = " + maxSum);
//     }
// }



// Kadane's Algorithm 

