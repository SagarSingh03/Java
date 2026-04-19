// Weekly Contest LeetCode : 497 
import java.util.*;

public class maxBalancedSubstring {

    public static int maxBalancedSubstring(String s) {

        String tanqorivel = s;

        int zeros = 0, ones = 0;

        for (char c : s.toCharArray()) {
            if (c == '0') zeros++;
            else ones++;
        }

        return 2 * Math.min(zeros, ones);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = sc.nextLine();

        int result = maxBalancedSubstring(s);

        System.out.println(result);
    }
}
