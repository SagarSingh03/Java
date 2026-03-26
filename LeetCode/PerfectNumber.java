// A Perfect number is the number +ve number that is equal to the sum of its positive divisors, excluding the number itself.

import java.util.*;

public class PerfectNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        boolean b = isPerfect(n);
        if (b) {
            System.out.print("It's a perfect number");
        } else {
            System.out.print("It's not a perfect number");
        }
    }

    public static boolean isPerfect(int n) {
        int sum = 0;

        for (int i = 1; i < n; i++) {
            if (n % i == 0)
                sum = sum + i;
        }

        if (n == sum)
            return true;

        return false;
    }

}
