    import java.util.*;

    public class Palindrome {
        public static void main(String[] args){
            Scanner sc = new Scanner(System.in); // Scanner for I/p
            int x = sc.nextInt(); // user se I/p lia

            Palindrome obj = new Palindrome();
            System.out.println(obj.isPalindrome(x));
        }

        public boolean isPalindrome(int x){
            if ( x < 0){
                return false;
            }

            int rev = 0;   // Reverse number store karega
            int num = x; // Original number ki copy

            while( num != 0){
                rev = rev * 10 + num % 10;  // Last digit nikal kar reverse me add kar rahe hain
                num = num / 10;  // Last digit remove kar rahe hain
            }

            return (rev == x);   // Reverse number ko original se compare kar rahe hain
        }
    }