// The Part of the quick sort is pivot and partititon : pivot : is the central point on which something turns or balances;
// Partition : Re arrange the array around the pivot. After partitioning, all elements smaller than the pivot will be on its left, and 
// all elements greater than the pivot will be on its right.

public class QuickSort {
    public static int partition(int arr[], int low, int high) {
        int pivot = arr[high];
        int i = low - 1;

        for (int j = low; j < high; j++) {
            // Using <= instead of < ensures elements equal to the pivot 
            // are handled correctly, making the partition more stable.
            if (arr[j] <= pivot) {
                i++;
                // swap
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        
        // Final swap to place the pivot in its correct sorted position
        i++;
        int temp = arr[i];
        arr[i] = arr[high]; // Use arr[high] instead of the local pivot variable for clarity
        arr[high] = temp;
        return i; // pivot index
    }

    public static void quickSort(int arr[], int low, int high) {
        if (low < high) {
            // Fix: Changed 'pivot' to 'pidx' to match your recursive calls below
            int pidx = partition(arr, low, high);

            quickSort(arr, low, pidx - 1);
            quickSort(arr, pidx + 1, high);
        }
    }

    public static void main(String args[]) {
        int[] arr = { 6, 3, 9, 5, 2, 8 };
        int n = arr.length;

        quickSort(arr, 0, n - 1);

        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}