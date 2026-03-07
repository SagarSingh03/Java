// Merge sort is Primarily based on divide and conquer. 
// here in merge sort given data can be sorted as well as unsorted if the data is unsorted then sort it first. 
// data can be sorted in any order asc or desc.
// It is a preferred algorithm for Sorting Linked list. in future 2 questions you can get Sort linkedlist and sort two linkedlist 
// Merge sort is slower than the Quick Sort in general as Quick sort is more cache friendly because it works in-place.
public class MergeSort {
    public static void conquer(int arr[], int si, int mid, int ei) {
        // Fix 1: Renamed 'merger' to 'merged' to match your usage below
        int merged[] = new int[ei - si + 1];

        int idx1 = si;
        int idx2 = mid + 1;
        int x = 0;

        while (idx1 <= mid && idx2 <= ei) {
            if (arr[idx1] <= arr[idx2]) {
                merged[x++] = arr[idx1++];
            } else {
                merged[x++] = arr[idx2++];
            }
        }

        // Fix 2: Added the missing while loop for the remaining elements of the second half
        while (idx1 <= mid) {
            merged[x++] = arr[idx1++];
        }

        while (idx2 <= ei) {
            merged[x++] = arr[idx2++];
        }

        // Fix 3: Corrected the loop syntax (replaced 'j = si' with 'int j = si')
        for (int i = 0, j = si; i < merged.length; i++, j++) {
            arr[j] = merged[i];
        }
    }

    public static void divide(int arr[], int si, int ei) {
        if (si >= ei) {
            return;
        }
        int mid = si + (ei - si) / 2;
        divide(arr, si, mid);
        divide(arr, mid + 1, ei);
        conquer(arr, si, mid, ei);
    }

    public static void main(String[] args) {
        int arr[] = { 6, 3, 9, 5, 2, 8 };
        int n = arr.length;

        divide(arr, 0, n - 1);

        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}