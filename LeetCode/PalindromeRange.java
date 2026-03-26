// Palindrome number 
// import java.util.*;

// public class Palindrome {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int x = sc.nextInt();

//         if (x < 0) { // -ve numbers are not palindrome
//             System.out.println(false);
//             return;
//         }

//         int rev = 0;
//         int num = x;

//         while (num != 0) {
//             rev = rev * 10 + num % 10;
//             num = num / 10;
//         }

//         System.out.println(rev == x); // compare rev == x 
//     }
// }

// Find Palindrome numbers in a given range ************************************************

import java.util.*;

public class PalindromeRange {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int start = sc.nextInt();
        int end = sc.nextInt();

        for (int i = start; i <= end; i++) {
            if (isPalindrome(i)) {
                System.out.print(i + " ");
            }
        }
    }

    public static boolean isPalindrome(int x) {
        int rev = 0;
        int num = x;

        while (num != 0) {
            rev = rev * 10 + num % 10;
            num = num / 10;
        }
        return rev == x;
    }

}
