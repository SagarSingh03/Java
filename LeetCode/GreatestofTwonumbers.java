
// Greatest of two numbers
import java.util.*;

public class GreatestofTwonumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        if (n == m) {
            System.out.print("n and m are equal");
        } else if (n > m) {
            System.out.print("n is the greatest");
        } else {
            System.out.print("m is the greatest");
        }
    }
}
