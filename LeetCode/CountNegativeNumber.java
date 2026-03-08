// Leetcode : 1351. In this question -ve number is given and I need to find the negative numbers from the matrix
public class CountNegativeNumber {
    public static void main(String[] args) {
        int[][] arr = { // int[][] -> 2D array
                { 4, 3, 2, -1 },
                { 3, 2, 1, -1 },
                { 1, 1, -1, -2 },
                { -1, -1, -2, -3 }
        };
        int negativeCount = 0;
        for (int i = 0; i < arr.length; i++) { // for rows 
            for (int j = 0; j < arr[i].length; j++) { // for columns
                if (arr[i][j] < 0) {
                    negativeCount++;
                }
            }
        }
        System.out.print(negativeCount);
    }
}
