
// A Fiboancci sequence is a part of Infinite Sequence where each number is the sum of the two preceding ones,
// Typically starting with 0 and 1 the sequnce begins : 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55 and so on.
import java.util.*;

public class FibonacciNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a = 0;
        int b = 1;
        if (n >= 1) {
            System.out.print(a + " ");
        }
        if (n >= 2) {
            System.out.print(b + " ");
        }
        for (int i = 2; i < n; i++) {
            int fib = a + b;
            System.out.print(fib + " ");
            a = b;
            b = fib;

        }
    }

}
