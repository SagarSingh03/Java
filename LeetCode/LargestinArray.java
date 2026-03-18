public class LargestinArray {
    public static void main(String[] args) {
        int[] nums = { -3, -2, -1, 0, 4, 8, 1, 2 };
        int largest = nums[0];
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > largest) {
                largest = nums[i];
            }
        }
        System.out.print("Largest Element in array : " + largest);
    }
}

// Use Math.max to find the largest element in array