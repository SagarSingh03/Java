import java.util.*;

public class Happynumber {
    public static boolean isHappy(int n) {
        HashSet<Integer> seen = new HashSet<>();

        while (n != 1 && !seen.contains(n)) {
            seen.add(n);
            int sum = 0;

            while (n > 0) {
                int digit = n % 10;
                sum += digit * digit;
                n = n / 10;
            }
            n = sum;
        }
        return n == 1;

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int num = sc.nextInt();

        if (isHappy(num)) {
            System.out.print("Happy number");
        } else {
            System.out.println("Not a happy number");
        }
    }
}