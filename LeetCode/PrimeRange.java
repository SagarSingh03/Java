// import java.util.*;

// public class PrimeNumber {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int x = sc.nextInt();

//         if (x <= 1) {
//             System.out.print("0 and 1 are not prime number");
//             return;
//         }

//         if (isPrime(x)) {
//             System.out.println("Prime Number");
//         } else {
//             System.out.println("Not a Prime Number");
//         }
//     }

//     public static boolean isPrime(int x) {
//         for (int i = 2; i * i <= x; i++) {
//             if (x % i == 0) {
//                 return false;
//             }
//         }
//         return true;
//     }

// }

// Prime numbers in a given range **************************************************

import java.util.*;

public class PrimeRange {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int start = sc.nextInt();
        int end = sc.nextInt();

        for (int i = start; i <= end; i++) {
            if (isPrime(i)) { // isPrime is a human made function
                System.out.print(i + " ");
            }
        }
    }

    public static boolean isPrime(int x) {
        if (x <= 1)
            return false;

        for (int i = 2; i * i <= x; i++) {
            if (x % i == 0) {
                return false;
            }
        }
        return true;
    }
}
