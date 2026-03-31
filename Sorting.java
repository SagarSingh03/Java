// Bubble Sorting : Interviewer can ask *************************************************************************
// Bubble sort is not the best method to sort array for large inputs
// Bubble sort n - 1 time run karega so iss se array sort ho hi jaata hai

// import java.util.*;

// public class Sorting {

//     public static void printArray(int arr[]) {
//         for (int i = 0; i < arr.length; i++) {
//             System.out.print(arr[i] + " ");
//         }
//         System.out.println();
//     }

//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int n = sc.nextInt();
//         int arr[] = new int[n];

//         for (int i = 0; i < n; i++) {
//             arr[i] = sc.nextInt();
//         }

//         for (int i = 0; i < arr.length - 1; i++) {
//             for (int j = 0; j < arr.length - i - 1; j++) {
//                 if (arr[j] > arr[j + 1]) {
//                     int temp = arr[j];
//                     arr[j] = arr[j + 1];
//                     arr[j + 1] = temp;
//                 }
//             }
//         }
//         printArray(arr);
//     }
// }

// Selection Sort
// ********************************************************************************
// This is also not a Optimized Algorithm for sorting but it is important for
// interview
// Yaha pe harr ek iteration pe ek swap hoga aur yei bhi n - 1 kei liye run
// karega

// class Sorting {
// public static void printArray(int arr[]) {
// for (int i = 0; i < arr.length; i++) {
// System.out.println(arr[i] + " ");
// }
// System.out.println();
// }

// public static void main(String args[]) {
// int arr[] = { 7, 8, 3, 1, 2 };
// for (int i = 0; i < arr.length; i++) {
// int smallest = i;
// for (int j = i + 1; j < arr.length; j++) {
// if (arr[smallest] > arr[j]) {
// smallest = j;
// }
// }
// int temp = arr[smallest];
// arr[smallest] = arr[i];
// arr[i] = temp;
// }
// printArray(arr);
// }
// }

// Insertion Sort
// ******************************************************************************
// Yaha pe sorted array rehta hai aur uska comparison with unsorted array

class Sorting {
    public static void printArray(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String args[]) {
        int arr[] = { 7, 8, 3, 1, 2 };

        // Insertion Sort :
        for (int i = 0; i < arr.length; i++) {
            int current = arr[i];
            int j = i - 1;
            while (j >= 0 && current < arr[j]) {
                arr[j + 1] = arr[j];
                j--;
            }

            arr[j + 1] = current;
        }
        printArray(arr);
    }
}

// Jo bhi cheeze static hoti hai usko memory ek baar dia jaata hai aur jo
// objects hota hai usko memory aap baar baar dena prta hai.

// After learning all 3 sorting practice these question in story type question
// and also TC and SC