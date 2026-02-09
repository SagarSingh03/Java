// // Bubble Sorting : Interviewer can ask *************************************************************************
// import java.util.*;

// class Sorting { // Bubble sort 
//     public static void printArray(int arr[]) {
//         for (int i = 0; i < arr.length; i++) {
//             System.out.println(arr[i] + " ");
//         }
//         System.out.println();
//     }

//     public static void main(String args[]) {
//         int arr[] = { 7, 8, 3, 1, 2 };
//         // T.C = 0(n^2)
//         // bubble sort
//         for (int i = 0; i < arr.length - 1; i++) { // outer loop runnign for n - 1 times 
//             for (int j = 0; j < arr.length - i - 1; j++) { 
//                 if (arr[j] > arr[j + 1]) {
//                     // swap 
//                     int temp = arr[j];
//                     arr[j] = arr[j + 1];
//                     arr[j + 1] = temp;
//                 }
//             }
//         }
//         printArray(arr);
//     }
// }

// Selection Sort ********************************************************************************
// This is also not a Optimized Algorithm for sorting but it is important for interview 
// import java.util.*;

// class Sorting {
//     public static void printArray(int arr[]) {
//         for (int i = 0; i < arr.length; i++) {
//             System.out.println(arr[i] + " ");
//         }
//         System.out.println();
//     }
//     public static void main(String args[]) {
//         int arr[] = { 7, 8, 3, 1, 2 };
//         for (int i = 0; i < arr.length; i++) {
//             int smallest = i;
//             for (int j = i + 1; j < arr.length; j++) {
//                 if (arr[smallest] > arr[j]) {
//                     smallest = j;
//                 }
//             }
//             int temp = arr[smallest];
//             arr[smallest] = arr[i];
//             arr[i] = temp;
//         }
//         printArray(arr);
//     }
// }

// Insertion Sort ******************************************************************************

// import java.util.*;

// class Sorting {
//     public static void printArray(int array[]) {
//         for (int i = 0; i < array.length; i++) {
//             System.out.println(array[i] + " ");
//         }
//         System.out.println();
//     }

//     public static void main(String args[]) {
//         int arr[] = { 7, 8, 3, 1, 2 };

//         // Insertion Sort :
//         for (int i = 0; i < arr.length; i++) {
//             int current = arr[i];
//             int j = i - 1;
//             while (j >= 0 && current < arr[j]) {
//                 arr[j + 1] = arr[j];
//                 j--;
//             }

//             arr[j + 1] = current;
//         }
//         printArray(arr);
//     }
// }


// Jo bhi cheeze static hoti hai usko memory ek baar dia jaata hai aur jo objects hota hai usko memory aap baar baar dena prta hai.