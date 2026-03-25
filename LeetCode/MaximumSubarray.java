// Leetcode 53: Maximum Subarray sums 
// In Subarray the array need to be continuous 
// Subarray can Start from any index of the array
// Here we have used Kadanes Algorithm 

import java.util.*;

public class MaximumSubarray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int currSum = arr[0], maxSum = arr[0];

        for (int i = 1; i < n; i++) {
            currSum = Math.max(arr[i], currSum + arr[i]);
            maxSum = Math.max(maxSum, currSum);
        }
        System.out.print(maxSum);
    }
}


