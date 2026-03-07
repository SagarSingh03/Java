// In basic DSA, there are mainly 2 common searching algorithms: Linear Search  Binary Search
// Binary search can always be applied over a sorted data. 
// mid = (low + high) / 2 . in Interviews don't use it it can cause overflow 
// use this mid = low + (high - low) / 2
public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
        int target = 8;

        int low = 0;
        int high = arr.length - 1;

        while (low <= high) {

            int mid = low + (high - low) / 2;

            if (target > arr[mid]) {
                low = mid + 1;
            } else if (target < arr[mid]) {
                high = mid - 1;
            } else {
                System.out.println("Element found at Index: " + mid);
                return;
            }
        }
        System.out.println("Element not found");
    }
}