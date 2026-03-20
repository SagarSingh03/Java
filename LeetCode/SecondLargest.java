// Second Largest Element 
public class SecondLargest {
    public static void main(String[] args) {
        int[] nums = { -3, -2, -1, 0, 4, 8, 1, 2 };

        int largest = nums[0];
        int secondLargest = -1;

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] > largest) {
                secondLargest = largest;
                largest = nums[i];
            } else if (nums[i] > secondLargest && nums[i] < largest) {
                secondLargest = nums[i];
            }
        }
        System.out.print("Second Largest Element : " + secondLargest);
    }
}
