// GFG 
// Given an array arr[] consisting of only 0’s and 1’s, return count of the maximum number of 
// consecutive 1’s or 0’s present in the array. 

import java.util.*;

public class MaxConsecutiveBit {
    public static void main(String[] args) {
        int[] arr = { 0, 1, 0, 1, 1, 1, 1 };

        int count = 1;
        int result = 1;

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] == arr[i - 1]) {
                count++;
            } else {
                count = 1;
            }

            result = Math.max(result, count);
        }
        System.out.print(result);
    }
}