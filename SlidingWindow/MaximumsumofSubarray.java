// Maximum sum subarray of size k 
public class MaximumsumofSubarray {
    public static void main(String[] args) {
        int[] arr = { 0, 1, 2, 3, 4, 5, 6 };
        int sum = 0,
                max = 0;

        int k = 3; // This size array sum will be printed

        for (int i = 0; i < k; i++) {
            sum = sum + arr[i]; // first loop which print the sum of array
        }

        max = Math.max(max, sum);
        for (int i = k; i < arr.length; i++) { // loop for moving ahead window wise
            sum = sum + arr[i]; // It takes the new element
            sum = sum - arr[i - k]; // It exists the Old element

            max = Math.max(max, sum);
        }

        System.out.print(max);
    }
}


