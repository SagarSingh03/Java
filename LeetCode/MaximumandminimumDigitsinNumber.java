import java.util.*;

public class MaximumandminimumDigitsinNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");

        String num = sc.next(); // take input as String

        int max = 0;
        int min = 9;

        for (int i = 0; i < num.length(); i++) {
            char ch = num.charAt(i);

            // Skip negative sign if present
            if (ch == '-') continue;

            int digit = ch - '0';

            if (digit > max)
                max = digit;

            if (digit < min)
                min = digit;
        }

        System.out.println("Maximum digit: " + max);
        System.out.println("Minimum digit: " + min);

        sc.close();
    }
}