// For this type of question we can use for loop one for loop from front and another for loop from behind and check if they match target
// Optimal solution is to use Binary search method
public class FirstandlastPositionElement {
    public static void main(String[] args) {
        int[] nums = { 5, 7, 7, 8, 8, 10 };
        int target = 8;
        int low = 0;
        int high = nums.length - 1;

        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (target > nums[mid]) {
                low = mid + 1;
            } else if (target < nums[mid]) {
                high = mid - 1;
            } else {
                System.out.print(mid);
            }
        }
        System.out.print("Element not found");
    }
}
