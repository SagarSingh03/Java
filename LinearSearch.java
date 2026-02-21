// Find element in array : Given an array, check if a target element is present. Return its index , else -1;
// public class LinearSearchArray {
//     public static int search(int[] arr, int target) {
//         for (int i = 0; i < arr.length; i++) {
//             if (arr[i] == target) {
//                 return i;
//             }
//         }
//         return -1;
//     }

//     public static void main(String[] args) {
//         int[] arr = { 10, 20, 30, 40, 50, 60 };
//         System.out.println(search(arr, 40));
//     }
// }

// Find Maximum element 
// public class LinearSearch {
//     public static int search(int[] arr) {
//         int max = arr[0];
//         for (int i = 0; i < arr.length; i++) {
//             if (arr[i] > max) {
//                 max = arr[i];
//             }
//         }
//         return max;
//     }
//     public static void main(String[] args) {
//         int[] arr = { 10, 20, 30, 40, 50 };

//         System.out.println(search(arr));
//     }
// }

// Find Minimum Element 

public class LinearSearch {
    public static int search(int[] arr){
        int min = arr[0];

        for (int i = 0; i < arr.length; i++){
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        return min;
    }
    public static void main(String[] args){
        int arr[] = {10, 20, 30, 40, 50, 60};
        System.out.println(search(arr));
    }
}