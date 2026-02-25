
// A Fiboancci sequence is a part of Infinite Sequence where each number is the sum of the two preceding ones,
// Typically starting with 0 and 1 the sequnce begins : 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55 and so on.
// import java.util.*;

// public class FibonacciNumber {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int n = sc.nextInt();
//         int a = 0;
//         int b = 1;
//         if (n >= 1) {
//             System.out.print(a + " ");
//         }
//         if (n >= 2) {
//             System.out.print(b + " ");
//         }
//         for (int i = 2; i < n; i++) {
//             int fib = a + b;
//             System.out.print(fib + " ");
//             a = b;
//             b = fib;

//         }
//     }

// }

// Another way : 

public class FibonacciNumber {
    public static int fib(int n) { // here we made fib static 
        if (n == 0 || n == 1) {
            return n;
        }
        return fib(n - 1) + fib(n - 2);
    }

    public static void main(String[] args) { // main is here static and one static only can called another static  fib() must also be static
        int n = 17;
        System.out.println(fib(n));
    }
}
