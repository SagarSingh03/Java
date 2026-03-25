// Most Frequent Even Element Leetcode :2404 
// Here I need to find the most frequent even Element if there is a tie in even number then return the smallest one, if there is no even number then return -1. 

import java.util.*;

public class MostFrequentEvenElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] nums = new int[n];

        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        HashMap<Integer, Integer> map = new HashMap<>();    

        // count frequency of even numbers
        for (int num : nums) {
            if (num % 2 == 0) {
                map.put(num, map.getOrDefault(num, 0) + 1);
            }
        }

        if (map.size() == 0) {
            System.out.print(-1);
            return;
        }

        int maxFreq = 0;
        int result = Integer.MAX_VALUE;

        for (int key : map.keySet()) {
            int freq = map.get(key);

            if (freq > maxFreq) {
                maxFreq = freq;
                result = key;
            } else if (freq == maxFreq) {
                result = Math.min(result, key);
            }
        }

        System.out.print(result);
    }

}

