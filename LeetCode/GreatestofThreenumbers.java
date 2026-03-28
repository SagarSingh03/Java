import java.util.*;

public class GreatestofThreenumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int o = sc.nextInt();

        if (n == m && m == o) {
            System.out.print("All numbers are equal");
        } else if (n >= m && n >= o) {
            System.out.print("n is greater than m and o");
        } else if (m >= n && m >= o) {
            System.out.print("m is greater than n and o");
        } else {
            System.out.print("o is the greatest number");
        }
        sc.close(); // closes the scanner object
    }
}
