// public class additionTwoArrays {
//     public static void main(String[] args) {
//         int[] arr1 = { 1, 2, 3 };
//         int[] arr2 = { 4, 5, 6 };

//         int n = arr1.length;
//         int[] result = new int[n];

//         for (int i = 0; i < n; i++) {
//             result[i] = arr1[i] + arr2[i];

//         }

//         for (int i = 0; i < n; i++) {
//             System.out.print(result[i] + " ");
//         }
//     }
// }

// Addition of 2d array 

public class additionoftwodArray {
    public static void main(String[] args) {
        int[][] arr1 = {
                { 1, 2, 3 },
                { 4, 5, 6 }
        };

        int[][] arr2 = {
                { 7, 8, 9 },
                { 1, 2, 3 }
        };

        int rows = arr1.length;
        int cols = arr1[0].length;

        int[][] result = new int[rows][cols];

        // Addition of matrices
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                result[i][j] = arr1[i][j] + arr2[i][j];
            }
        }

        // Print result

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(result[i][j] + " ");
            }
            System.out.println();
        }
    }

}