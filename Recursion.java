// Print numbers from 5 to 1 ************************************
// public class Recursion {
//     public static void printNumb(int n) {
//         if (n == 0) {
//             return;
//         }
//         System.out.println(n);
//         printNumb(n - 1);
//     }
//     public static void main(String args[]){
//         int n = 5; // 5 4 3 2 1
//         printNumb(n);
//     }
// }

// Print numbers from 1 to 5 ********************************
// public class Recursion {
//     public static void printNumb(int n){
//         if ( n == 6){
//             return;
//         }
//         System.out.println(n);
//         printNumb( n + 1);
//     }
//     public static void main(String[] args){
//         int n = 1;
//         printNumb(n);
//     }
// }

// Print sum of the numbers *******************************************
public class Recursion {
    public static void printSum(int i, int n, int sum) {
        if (i == n) {
            sum += i;
            System.out.println(sum);
            return;
        }
        sum += i;
        printSum(i + 1, n, sum);
    }

    public static void main(String args[]) {
        printSum(1, 5, 0);
    }
}

// Print Factorial of a number ****************************************

