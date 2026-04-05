// Recursion is function which calls itself directly or indirectly to solve a problem
// Prerequisite for recursion is Iteration / Loops and Functions
// At some places doing iteration is tough that's why we use recursion and some places recursion is tough that's why we use iteration there
// In recursion function calls itself till the base case is reached

// Recusrion value decreasing *************************************************
// public class Recursion1 {
//     public static void printNumb(int n) {
//         if (n == 0) {
//             return;
//         }
//         System.out.println(n);
//         printNumb(n - 1);
//     }

//     public static void main(String[] args) {
//         int n = 1;
//         printNumb(n);
//     }
// }

// Recursion value increasing *************************************************
// public class Recursion1 {
//     public static void printNumb(int n) {
//         if (n == 6) {
//             return;
//         }
//         System.out.println(n);
//         printNumb(n + 1);
//     }

//     public static void main(String[] args) {
//         int n = 1;
//         printNumb(n);
//     }
// }

// Sum of first n natural numbers using Recursion ********************************************
// public class Recursion1 {
//     public static void printSum(int i, int n, int sum) {
//         if (i == n) {
//             sum = sum + i;
//             System.out.println(sum);
//             return;
//         }
//         sum = sum + i;
//         printSum(i + 1, n, sum);
//         // System.out.println(i);
//     }

//     public static void main(String[] args) {
//         printSum(1, 5, 0);
//     }
// }

// Calculate Factorail using recursion  ************************************************
// public class Recursion1 {

//     public static int calcfactorial(int n) {
//         if (n == 0 || n == 1) {
//             return 1;
//         }

//         int fact_n_minus_1 = calcfactorial(n - 1);
//         int fact_n = n * fact_n_minus_1;
//         return fact_n;
//     }

//     public static void main(String[] args) {
//         int n = 5;
//         int ans = calcfactorial(n);
//         System.out.println(ans);
//     }
// }

// Calculating Fibonacci Sequence using Recursion ***************************************
// Fibonacci Formula is : F(n) = F( n - 1) + F(n - 2);
// public class Recursion1 {

//     public static int Fibonacci(int n) {
//         if (n == 0 || n == 1) {
//             return n;
//         }

//         return Fibonacci(n - 1) + Fibonacci(n - 2);

//     }

//     public static void main(String[] args) {
//         int n = 7;
//         System.out.print(Fibonacci(n));
//     }
// }

// Print X ^ n ( with Stack height = n) ******************************************************

// public class Recursion1 {
//     public static int power(int x, int n) {
//         if (n == 0) {
//             return 1;
//         }
//         return x * power(x, n - 1);
//     }

//     public static void main(String[] args) {
//         int x = 2;
//         int n = 5;
//         System.out.print(power(x, n));
//     }
// }

// Print X ^ n ( with Stack height = logn) ************************************************************
public class Recursion1 {
    public static int power(int x, int n) {
        if (n == 0) {
            return 1;
        }

        // If n is even
        if (n % 2 == 0) {
            return power(x, n / 2) * power(x, n / 2);
        } else { // if n is odd
            return power(x, n / 2) * power(x, n / 2) * x;
        }
    }

    public static void main(String[] args) {
        int x = 2, n = 5;
        int ans = power(x, n);
        System.out.print(ans);
    }
}